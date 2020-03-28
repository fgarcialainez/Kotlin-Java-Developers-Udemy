package academy.learnprogramming.textadventure

fun main() {

    var loc = 64
    val locations = readLocationInfo()

    while (true) {

        val location = locations[loc] ?: Location(0,
                       "Sorry, something went wrong, so the game will terminate")

        println(location.description)

        if (location.locationID == 0) {
            break
        }

        print("Available exits are: ")

        location.exits.keys.forEach {
            print("$it, ")
        }

        val direction = readLine()?.toUpperCase() ?: "Z"

        if (location.exits.containsKey(direction)) {
            loc = location.exits[direction]!!
        }
        else {
            println("You can't go in that direction")
        }
    }
}