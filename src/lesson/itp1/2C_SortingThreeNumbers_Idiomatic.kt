package lesson.itp1

fun main() {
    readLine()!!
        .split(' ')
        .map(String::toInt)
        .sorted()
        .joinToString(" ")
        .let(::println)
}
