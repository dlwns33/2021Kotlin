package chap05.section2

fun main() {

    var total = 0

    for(num in 1..100 step 2)
    {
        //odd numbers
        total += num
    }

    println("total: $total")
}