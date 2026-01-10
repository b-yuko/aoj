package lesson.itp1

fun main() {
    val ( x ) = readLine()!!.split(" ").map(String::toInt)
    var i = 0
    while (x > 0) {
        println("Case $i: $x")
        i++
    }
}