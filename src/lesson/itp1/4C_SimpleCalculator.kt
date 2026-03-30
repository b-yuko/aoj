package lesson.itp1

fun main() {
    while (true) {
        val (a, op, b) = readLine()!!.split(" ")
        if (op == "?") break
        val x = a.toInt()
        val y = b.toInt()
        println(when(op){
            "+" -> x + y
            "-" -> x - y
            "*" -> x * y
            "/" -> x / y
            else -> "?"
        })
    }
}



/**
 *
 * a と b は 整数
 *
 * op は 演算子
 *
 * op が ? だったら 終了
 *
 * a op b  の順で入力が渡される
 *
 * a op b それぞれに値を入れる
 * val (a, op, b) = readLine()!!.split(" ") *
 *
 * **/