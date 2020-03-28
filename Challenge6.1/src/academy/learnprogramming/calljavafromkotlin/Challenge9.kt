package academy.learnprogramming.calljavafromkotlin

import academy.learnprogramming.javacode.Employee

fun main() {

    val employee = Employee("Jane", "Smith", 2000)

    // Make this code compile
    employee.lastName = "Jones"
    employee.salaryLast3Years = arrayOf(50000.25, 54000.60, 56800.42).map { it.toFloat() }.toFloatArray()
}