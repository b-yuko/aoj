package lesson.itp1

fun main() {
    readLine()!!
    val numbers = readLine()!!.split(" ").map(String::toLong)
    println("${numbers.minOrNull()} ${numbers.maxOrNull()} ${numbers.sum()}")
}


/**
 *
 * １行目の数字は、整数が何個与えられるかの整数
 * ２行目の数字は、１行目で与えられた数だけの整数
 *
 * 最小値、最大値、合計をアウトプットする
 * **/