package lesson.itp1

fun main() {
    val (w, h, x, y, r) = readLine()!!.split(" ").map(String::toInt)

    println(if(x - r >= 0 && x + r <= w && y - r >= 0 && y + r <= h) "Yes" else "No")
}
