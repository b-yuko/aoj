package lesson.itp1

fun main() {
    while (true) {
        val (rows, cols) = readLine()!!.trim().split(" ").map ( String::toInt )
        if (rows == 0 && cols == 0) break
        repeat(rows) {
            println("#".repeat(cols))
        }
        println()
    }
}


