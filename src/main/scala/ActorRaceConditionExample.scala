import akka.actor.{Actor, ActorSystem, Props}

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}


case object Increment
case object GetCount

class CounterActor extends Actor {
  var counter: Int = 0

  def receive: Receive = {
    case Increment => counter += 1
    case GetCount => sender() ! counter
  }
}


object ActorRaceConditionExample {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("ActorSystem")
    val counterActor = system.actorOf(Props[CounterActor], "counterActor")


    import akka.pattern.ask
    import akka.util.Timeout
    import system.dispatcher

    implicit val timeout: Timeout = Timeout(5.seconds)

    val futures = for (! <- 1 to 10) yield Future {
      for(_ <- 1 to 1000) {
        counterActor ! Increment
      }
    }

    Await.result(Future.sequence(futures), 10.seconds)

    val futureCount = (counterActor ? GetCount).mapTo[Int]
    val finalCount = Await.result(futureCount, 5.seconds)

    println(s"Final counter value: ${finalCount}")

    system.terminate()
  }
}
