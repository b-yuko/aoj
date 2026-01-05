package lesson.itp1

fun main() {
    val items = readLine()!!.split(" ").map(String::toInt)

    println(items.sorted().joinToString(" "))
}
