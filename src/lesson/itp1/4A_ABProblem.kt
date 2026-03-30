package lesson.itp1

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    val d = a / b
    val r = a % b
    val f = a.toDouble() / b.toDouble()
    println("%d %d %f".format(d, r, f))
}
