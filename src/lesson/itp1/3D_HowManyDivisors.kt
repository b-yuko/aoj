package lesson.itp1

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    var i = a
    var count = 0
    while(i <= b) {
        if(c % i == 0) count += 1
        i++
    }
    println(count)
}