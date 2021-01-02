package chap04.section4

var global = 10
fun main() {
    global = 15
    val local1 = 15
    println("global $global")
    userFunc()
    println("final - global $global, $local1")
}

fun userFunc()
{
    global = 20
    val local1 = 20
    println("global $global, $local1")
}