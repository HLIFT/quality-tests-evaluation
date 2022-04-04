package org.mydigitalschool.employee.employee

class EmployeeService {

    fun findAdults(employees: List<Employee>): List<Employee> {
        return employees.filter { it.age >= 18 }
    }

    fun sortEmployees(employees: List<Employee>): List<Employee> {
        return employees.sortedBy { it.name }
    }

    fun capitalizeNames(employees: List<Employee>): List<Employee> {
        return employees.map { Employee(it.name.uppercase(), it.age) }
    }

    fun sortEmployeesDescending(employees: List<Employee>): List<Employee> {
        return employees.sortedByDescending { it.name }
    }

    fun findWithAgeBetween(employees: List<Employee>, low: Int, high: Int): List<Employee> {
        return employees.filter { it.age in low..high }
    }

    fun autocomplete(employees: List<Employee>, prefix: String): List<Employee> {
        return employees.filter { it.name.startsWith(prefix) }
    }
}