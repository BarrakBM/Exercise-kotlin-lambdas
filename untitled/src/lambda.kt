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
fun calculateDepth(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

val depth:(Int, Int) -> Int = {x, y -> x-y}

//Part 5: Lambda with Extension Functions – Diving Message
fun String.loud(): String{
    return this.uppercase() + "!"
}

val diveMessage:(String) -> String ={message -> message.loud()}

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



}
