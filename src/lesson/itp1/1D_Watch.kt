package lesson.itp1

fun main() {
    val S = readLine()!!.toInt()

    val h = S / 3600
    val m = (S % 3600) / 60
    val s = S % 60

    println("$h:$m:$s")
}
