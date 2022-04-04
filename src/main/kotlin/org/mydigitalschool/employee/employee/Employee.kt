package org.mydigitalschool.employee.employee

data class Employee(private val name: String, private val age: Int)

val employees = listOf(
    Employee("John", 25),
    Employee("Ethan", 16),
    Employee("Sophia", 17),
    Employee("Daniel", 35),
    Employee("Mike", 28),
    Employee("Charles", 15),
    Employee("Nina", 24)
)