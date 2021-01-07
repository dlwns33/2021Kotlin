package MiniProject

fun initBoard()
{
    val board = arrayOf(arrayOf(0,0,0),arrayOf(0,0,0),arrayOf(0,0,0))
}

fun printBoard(){
    println("  0  1  2")
    println("0  | |")
    println("  -+-+-")
    println("1  | |")
    println("  -+-+-")
    println("2  | |")
}

fun playerInput(){

}
fun main() {
    val turn = 0
    println("$turn 번째 턴")
    printBoard()

    val player1 = 1
    val player2 = 2
    println("Player ")
}