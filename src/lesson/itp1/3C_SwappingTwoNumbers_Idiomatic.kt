package lesson.itp1

fun main() {
    generateSequence(::readLine) // 関数の参照を利用
        .map { it.split(" ").map(String::toInt) }
        .takeWhile { (x, y) -> x != 0 || y != 0 } // 分割代入で条件判定
        .forEach { list ->
            // listをソートして、スペースで結合して出力
            println(list.sorted().joinToString(" "))
        }
}
