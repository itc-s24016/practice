package Chapter05

// ループについて（forEach, forEachIndexed）
fun main() {
    val colors = listOf("red", "green", "blue")

    // forEach_1 （要素を変数 color に代入している）
    colors.forEach { color ->
        println(color)
    }

    // forEach_2 （it を使うと、代入せずに直接参照できる）
    colors.forEach { println(it) }

    // forEachIndexed （インデックス付きで処理できる）
    colors.forEachIndexed { index, it ->
        println("$index:$it")
    }
}