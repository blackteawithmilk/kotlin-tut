package demopackage

fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

fun main(args: Array<String>) {
    printSum(7, 3)
}