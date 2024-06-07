package inter

trait HasNumericValue[A] {
  def getNumericValue(a: A): Double
}

case class Employee(name: String, salary: Double)
case class Movie(name: String, rating: Double)

object HasNumericValueInstances {
  implicit val employeeHasNumericValue: HasNumericValue[Employee] = (e: Employee) => e.salary

  implicit val movieHasNumericValue: HasNumericValue[Movie] = (m: Movie) => m.rating
}

object Solutions {
  private def sortEmployeesByDesc(employees: List[Employee]): List[Employee] = {
    val sortedEmployees = employees.sortBy(_.salary)
    sortedEmployees.reverse
  }

  def top10PercentEmployees(employees: List[Employee]): List[Employee] = {
    if(employees.isEmpty) List.empty[Employee]
    else {
      val sortedEmployeesDesc = sortEmployeesByDesc(employees)
      val tenPercentIndex = Math.ceil(employees.length * .1).toInt
      sortedEmployeesDesc.take(tenPercentIndex)
    }
  }

  def topPercentEmployees(employees: List[Employee], percent: Double): List[Employee] = {
    if(employees.isEmpty) List.empty[Employee]
    else {
      val sortedEmployeesDesc = sortEmployeesByDesc(employees)
      val percentCount = (employees.length * (percent / 100)).toInt
      sortedEmployeesDesc.take(percentCount)
    }
  }

  def topPercentItems[A: HasNumericValue](items: List[A], percent: Double)(implicit ev: HasNumericValue[A]): List[A] = {
    if(items.isEmpty) List.empty[A]
    else {
      val sortedItems = items.sortBy(item => -ev.getNumericValue(item))
      val topPercentCount = Math.ceil(items.length * (percent / 100)).toInt
      sortedItems.take(topPercentCount)
    }
  }

}
