package chap04.section4

fun main() {
    val num = 3
    //val str = num.strplus("Kotlin")
    val str = num strplus "Kotlin"
    println(str)
}

infix fun Int.strplus(x: String): String{
    return "$x version $this"
}