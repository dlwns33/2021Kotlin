package chap04.section1

fun main() {
    val result: Int

    val multi = {a: Int,b:Int ->
        println("a:$a,b:$b")
            a*b}

    //val nestedLambda: () -> () ->Unit = {{ println("nestedLambda")}}
    result = multi(10,20)
    println(result)
}