package lesson.itp1

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)

    println(if(a < b && b < c) "Yes" else "No" )
}