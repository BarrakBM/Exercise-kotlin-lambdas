import kotlin.time.measureTime

//Part 1: Lambda with No Parameters – Greeting the Sea Creatures
val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!")}

// Part 2: Simple Lambda Expression – Finding a Hidden Pearl
// val multiply = { a: Int, b: Int -> a * b }
//{numPearls: Int -> (numPearls * numPearls)}
// val multiply: (Int, Int) -> Int = { a, b -> a * b }
val findPearl:(Int) -> Int = {numPearls -> numPearls * numPearls}

// Part 3: Lambda with Multiple Parameters – Dividing the Treasure
//val divideTreasure = {totalTreasure: Double, numExplorers: Double -> (totalTreasure/numExplorers)}
val divideTreasure: (Double, Double) -> Double = {totalTreasure, numExplorers -> totalTreasure/numExplorers}



// Part 4: Higher-Order Function with Lambda – Calculating Depth
fun calculateDepth(location1: Int, location2: Int, operation: (Int, Int) -> Int): Int {
    return operation(location1, location2)
}

val depth:(Int, Int) -> Int = {location1, location2 -> location1 - location2}

//Part 5: Lambda with Extension Functions – Diving Message
fun String.loud(): String{
    return this.uppercase() + "!"
}

val diveMessage:(String) -> String ={message -> message.loud()}

// Bonus Challenge: Lambda as an Inline Function – Exploring Uncharted Waters
/*
Step 1: Define an inline function named exploreWaters that takes a lambda function as a parameter.
Step 2: Inside exploreWaters, record the start and end time of exploring uncharted waters,
execute the lambda function, and print the time taken.

Step 3: Call exploreWaters with a lambda that prints "Exploring the unknown depths...".
Expected Output:
Exploring the unknown depths...
Time taken: X milliseconds
*/


inline fun exploreWaters(timeTaken: () -> Unit): Long {
    val startTime = System.currentTimeMillis() // start calculating the time
    timeTaken() // execute the function
    return System.currentTimeMillis() - startTime // return the time took to execute it
}

fun main() {

    //1st task
    greetSeaCreatures()

    //2nd task
    println(findPearl(6))

    //3rd task
    println(divideTreasure(1000.0, 5.0))

    //4th task
    calculateDepth(1500, 800, depth)

    //5th task
    println(diveMessage("deep sea"))

    //Bonus task
    val exploreTime = exploreWaters{
        println("Exploring the unknown depths...")
    }
    println("Time taken: $exploreTime milliseconds")

}
