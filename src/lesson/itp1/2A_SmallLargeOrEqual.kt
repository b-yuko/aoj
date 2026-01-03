package lesson.itp1

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if(a < b){
        println("a < b")
    } else if(a > b){
        println("a > b")
    } else
        println("a == b")
}
