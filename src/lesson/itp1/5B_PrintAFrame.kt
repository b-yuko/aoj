package lesson.itp1

fun main() {
    while (true) {
        val (H, W) = readLine()!!.trim().split(" ").map(String::toInt)
        if (H == 0 && W == 0) break
        println("#".repeat(W))
        repeat(H - 2) {
            println("#${".".repeat(W - 2)}#")
        }
        println("#".repeat(W))
        println()
    }
}