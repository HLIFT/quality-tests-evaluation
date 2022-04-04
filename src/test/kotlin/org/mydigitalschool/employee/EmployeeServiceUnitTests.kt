package org.mydigitalschool.employee

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
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

    private val employeeService: EmployeeService = EmployeeService()

    @Test
    fun `get adults employees`() {
        //GIVEN
        val expected = listOf(
            Employee("John", 25),
            Employee("Daniel", 35),
            Employee("Mike", 28),
            Employee("Nina", 24)
        )

        //WHEN
        val result = employeeService.findAdults(employees)

        //THEN
        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `get employees order by name`() {
        //GIVEN
        val expected = listOf(
            Employee("Charles", 15),
            Employee("Daniel", 35),
            Employee("Ethan", 16),
            Employee("John", 25),
            Employee("Mike", 28),
            Employee("Nina", 24),
            Employee("Sophia", 17),
        )

        //WHEN
        val result = employeeService.sortEmployees(employees)

        //THEN
        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `get employees name capitalize`() {
        //GIVEN
        val expected = listOf(
            Employee("JOHN", 25),
            Employee("ETHAN", 16),
            Employee("SOPHIA", 17),
            Employee("DANIEL", 35),
            Employee("MIKE", 28),
            Employee("CHARLES", 15),
            Employee("NINA", 24)
        )

        //WHEN
        val result = employeeService.capitalizeNames(employees)

        //THEN
        Assertions.assertEquals(expected, result)

    }

    @Test
    fun `get employees order by name descending`() {
        //GIVEN
        val expected = listOf(
            Employee("Sophia", 17),
            Employee("Nina", 24),
            Employee("Mike", 28),
            Employee("John", 25),
            Employee("Ethan", 16),
            Employee("Daniel", 35),
            Employee("Charles", 15),
        )

        //WHEN
        val result = employeeService.sortEmployeesDescending(employees)

        //THEN
        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `get employees with age between`() {
        //GIVEN
        val expected = listOf(
            Employee("John", 25),
            Employee("Mike", 28),
            Employee("Nina", 24)
        )

        //WHEN
        val result = employeeService.findWithAgeBetween(employees, 20, 30)

        //THEN
        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `get employees with name start with`() {
        //GIVEN
        val expected = listOf(
            Employee("Sophia", 17),
        )

        //WHEN
        val result = employeeService.autocomplete(employees, "S")

        //THEN
        Assertions.assertEquals(expected, result)
    }
}