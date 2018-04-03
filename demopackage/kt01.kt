package demopackage

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
//
//fun main(args: Array<String>) {
//    println("7 + 3 = ${sum(7, 3)}")
//}

//fun sum(a: Int, b: Int) = a + b
//
//fun main(args: Array<String>) {
//    println("7 + 3 = ${sum(7,3)}")
//}

fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

fun main(args: Array<String>) {
    printSum(7, 3)
}