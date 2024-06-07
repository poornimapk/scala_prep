package inter

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import HasNumericValueInstances._

class SolutionsTest extends AnyFlatSpec with Matchers{
  val employees = List(
    Employee("Danny", 190),
    Employee("Josh", 300),
    Employee("Eric", 220),
    Employee("Ali", 400),
    Employee("Danielle", 1100),
    Employee("Richa", 600),
    Employee("Matt", 500),
    Employee("Ben", 200),
    Employee("Aaron", 670),
    Employee("Jones", 250),
    Employee("Smith", 450),
  )

  val movies = List(
    Movie("X-men Origins: Wolverine", 38),
    Movie("The Wolverine", 71),
    Movie("Logan", 93),
    Movie("X-men", 82),
    Movie("X2", 85),
    Movie("X-men: First Class", 86),
    Movie("X-men: The Last Stand", 57),
    Movie("X-men: Days of Future Past", 90),
    Movie("Deadpool and Wolverine", 100),
    Movie("Deadpool", 85),
    Movie("Deadpool 2", 84),
  )


  "Number of top 10%" should "be correctly computed for the above list of employees" in {
    val top10PercentBySal = Solutions.top10PercentEmployees(employees)
    top10PercentBySal.length should be (2)
    top10PercentBySal(0).name should be ("Danielle")
    top10PercentBySal(1).name should be ("Aaron")
  }

  "Number of top 20%" should "be correctly computed for the above list of employees" in {
    val top20PercentBySal = Solutions.topPercentEmployees(employees, 20)
    top20PercentBySal.length should be (2)
    top20PercentBySal(0).name should be ("Danielle")
    top20PercentBySal(1).name should be ("Aaron")
  }

  "Number of top 50%" should "be correctly computed for the above list of employees" in {
    val top50PercentBySal = Solutions.topPercentEmployees(employees, 50)
    top50PercentBySal.length should be (5)

  }

  "Number of top 10%" should "be correctly computed for the above list of employees using generics" in {
    val top10PercentBySal = Solutions.topPercentItems(employees, 10)
    top10PercentBySal.length should be (2)
    top10PercentBySal(0).name should be ("Danielle")
    top10PercentBySal(1).name should be ("Aaron")
  }

  "Number of top 10%" should "be correctly computer for the above list of movies using generics" in {
    val top10PercentMovies = Solutions.topPercentItems(movies, 10)
    top10PercentMovies.length should be (2)
  }
}
