package lesson.itp1

data class Rectangle(val width: Int, val height: Int) {
    companion object {
        const val MIN_SIZE = 1
        const val MAX_SIZE = 100
    }

    init {
        require(width in MIN_SIZE..MAX_SIZE) { "Width must be between $MIN_SIZE and $MAX_SIZE" }
        require(height in MIN_SIZE..MAX_SIZE) { "Height must be between $MIN_SIZE and $MAX_SIZE" }
    }

    val area = width * height
    val perimeter = 2 * (width + height)
}

fun parseRectangle(input: String): Rectangle? {
    val parts = input.trim().split(" ")
    if (parts.size != 2) return null

    return try {
        val a = parts[0].toInt()
        val b = parts[1].toInt()
        Rectangle(a, b)
    } catch (_: NumberFormatException) {
        null
    }
}

fun main() {
    val input = readLine() ?: return

    val rectangle = parseRectangle(input)

    if (rectangle != null) {
        println("${rectangle.area} ${rectangle.perimeter}")
    } else {
        System.err.println("Error: 「3 5」のように、1〜100の数値を半角スペース1つで区切って入力してください。")
    }
}
