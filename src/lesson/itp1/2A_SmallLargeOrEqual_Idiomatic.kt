package lesson.itp1

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)

    println(when {
        a < b -> "a < b"
        a > b -> "a > b"
        else -> "a == b"
    })
}
