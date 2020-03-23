package academy.learnprogramming.section6challenge

fun main() {

    // Using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line
    for (i in 5..5000 step 5) {
        println(i)
    }

    // Using a range, -500..0, each number on a separate line
    for (i in -500..0) {
        println(i)
    }

    // Using a range, print the first 15 numbers in the  Fibonacci sequence,
    // each number on a separate line.  Hint: you'll have to print the first
    // one or two numbers outside the range 0, 1, 1, 2, 3, 5, 8...

    val n = 15
    var t1 = 0
    var t2 = 1

    println("First $n terms in the Fibonacci sequence:")

    for (i in 1..n) {
        println("$t1")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

    // Modify the following code so that it prints the following,
    // each number on a separate line 1, 11, 100, 99, 98, 2
    iloop@ for (i in 1..5) {
        println(i)

         if (i == 2) {
             break
         }

        for (j in 11..20) {
            if (j == 12) {
                break
            }

            println(j)

            for (k in 100 downTo 90) {
                println(k)

                if (k == 98) {
                    continue@iloop
                }
            }
        }
    }

    // Declare a variable called num (int) and assign it whatever you want
    val num: Int = 100

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression

    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }

    // Then print the value of dnum - separate statement
    println("$dnum")
}