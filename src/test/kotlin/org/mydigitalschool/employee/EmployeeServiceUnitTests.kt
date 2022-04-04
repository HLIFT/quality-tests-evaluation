package org.mydigitalschool.employee

import org.mydigitalschool.employee.employee.Employee
import org.mydigitalschool.employee.employee.EmployeeService

val employees = listOf(
    Employee("John", 25),
    Employee("Ethan", 16),
    Employee("Sophia", 17),
    Employee("Daniel", 35),
    Employee("Mike", 28),
    Employee("Charles", 15),
    Employee("Nina", 24)
)

class EmployeeServiceUnitTests {

    val employeeService: EmployeeService = EmployeeService()

}