package lesson.itp1

import kotlin.math.PI

fun main() {
    val radius = readLine()!!.toDouble()

    // 面積の計算: 半径 * 半径 * PI
    val area = radius * radius * PI

    // 円周の計算: 直径 * PI
    val circumference = 2 * radius * PI

    println("%f %f".format(area, circumference))
}
