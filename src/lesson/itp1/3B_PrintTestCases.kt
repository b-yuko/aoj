package lesson.itp1

fun main() {
    var i = 1
    while (true) {
        val x = readLine()!!.toInt()
        if (x == 0) break
        println("Case $i: $x")
        i++
    }
}
