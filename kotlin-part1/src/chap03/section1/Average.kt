package chap03.section1

fun average(initial: Float = 0f, vararg numbers: Float):Double{
    var result = 0f
    for(num in numbers)
    {
        result += num
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg = result/numbers.size
    return (avg+initial).toDouble()
}

fun main() {
    val result = average(5f,100f,90f,80f)
    println("avg result:$result")
}