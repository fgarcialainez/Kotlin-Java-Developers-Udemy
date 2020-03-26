package academy.learnprogramming.section7challenge

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    // Exercise 1
    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    // Exercise 2
    var people = mapOf("Jones" to joe,
                    "Smitch" to jane,
                    "Wilson" to mary,
                    "Adams" to john,
                    "Smithson" to jean)

    // Exercise 3
    println(people.filter { it.value.lastName.startsWith('S') }.count())

    // Exercise 4
    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    val firstNames = people.map { it.value.firstName }
    val lastNames = people.map { it.value.lastName }
    val namePairs2 = firstNames.zip(lastNames)
    println(namePairs2)

    // Exercise 5
    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    // Exercise 6
    var list1 = listOf(1, 4, 9, 15, 33)
    var list2 = listOf(4, 55, -83, 15, 22, 101)

    var list3 = list1.filter { it in list2 }
    println(list3)

    var list4 = list1.filter { list2.contains(it) }
    println(list4)

    // Exercise 7 (Covariance)
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()

    paper = regularPaper
    println(paper)
}


class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}


class Box<out T> {

    // ok!
    //fun takePaper(): T {
    //}

    // bad!
    //fun addPaper(paper: T) {
    //}
}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}