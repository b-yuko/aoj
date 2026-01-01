package lesson.itp1

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val area = a * b
    val perimeter = 2 * (a + b)
    println("$area $perimeter")
}
