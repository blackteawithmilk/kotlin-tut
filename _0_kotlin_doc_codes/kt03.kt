package demopackage

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String): Unit {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("wrong number format in arg1: '${arg1}'")
        return
    }

    if (y == null) {
        println("wrong number format in arg2: '${arg2}'")
        return
    }

    println("${arg1} * ${arg2} = ${x * y}")
}

fun main(args: Array<String>) {
    printProduct("a3", "7")
}