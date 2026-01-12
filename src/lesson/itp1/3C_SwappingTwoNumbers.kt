package lesson.itp1

fun main(){
    while (true){
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        if (x == 0 && y == 0) break
        println(when {
            x <= y -> "$x $y"
            else -> "$y $x"
        })
    }
}