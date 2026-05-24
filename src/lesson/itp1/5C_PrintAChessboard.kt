package lesson.itp1

fun main() {
    while (true) {
        val (H, W) = readLine()!!.trim().split(" ").map(String::toInt)
        if (H == 0 && W == 0) break
        for (i in 0 until H) {
            val row = StringBuilder()
            for (j in 0 until W) {
                row.append(if ((i + j) % 2 == 0) '#' else '.')
            }
            println(row)
        }
        println()
    }
}
