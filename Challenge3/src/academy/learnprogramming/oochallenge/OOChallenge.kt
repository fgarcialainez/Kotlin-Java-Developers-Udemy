package academy.learnprogramming.oochallenge

fun main() {
    val bicycle = KotlinBicycle(10, 40, 4)
    bicycle.printDescription()

    val mountainBike = KotlinMountainBike(20, 10, 40, 2)
    mountainBike.printDescription()

    val roadBike = KotlinRoadBike(10, 10, 40, 2)
    roadBike.printDescription()

    val bicycle2 = KotlinBicycle(10, 40, 4)
    bicycle2.printDescription()

    val mountainBike2 = KotlinMountainBike(20, 10, 40)
    mountainBike2.printDescription()

    val roadBike2 = KotlinRoadBike(10, 10, 40)
    roadBike2.printDescription()

    val mountainBike3 = KotlinMountainBike("Blue", 20, 10, 40)
    mountainBike3.printDescription()

    KotlinMountainBike.availableColors.forEach{ println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence " +
                "travelling at a speed of $speed.")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
        KotlinBicycle(cadence, speed, gear) {

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
            this(seatHeight, cadence, speed, gear) {
        println("This is the $color")
    }

    override fun printDescription() {
        super.printDescription()

        println("The mountain bike has a seat height of $seatHeight inches.")
    }

}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10) :
        KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()

        println("The road bike has a tire width of $tireWidth mm.")
    }
}