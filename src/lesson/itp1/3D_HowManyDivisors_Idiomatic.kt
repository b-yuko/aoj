package lesson.itp1

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    println((a..b).count { c % it == 0 })
}
