package demopackage

// if表达式

fun printMaxOf(a: Int, b: Int): Unit {
    println("max of $a and $b is ${
        if (a > b) a else b}")
}

fun main(args: Array<String>) {
    printMaxOf(7, 7)
}