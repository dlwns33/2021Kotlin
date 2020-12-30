package chap03.section3

fun highFun(sum: (Int,Int)-> Int, a: Int, b:Int): Int{
    return sum(a,b)
}
fun main() {
    val result = highFun({x,y->x+y},1,3)
    println(result)
}