package demopackage

//fun maxOf(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    }
//    else {
//        return b
//    }
//}
//
//fun main(args: Array<String>) {
//    println("max of 7 and 3 is ${maxOf(7,3)}")
//}

//fun maxOf(a: Int, b: Int): Int = if (a > b) a else b
//
//fun main(args: Array<String>) {
//    println("max of 7 and 3 is ${maxOf(7,3)}")
//}

fun printMaxOf(a: Int, b: Int): Unit {
    println("max of $a and $b is ${
        if (a > b) a else b}")
}

fun main(args: Array<String>) {
    printMaxOf(7, 7)
}