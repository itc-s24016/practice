package chapter07

// 可変長引数について
fun joinTitles(vararg titles: String): String =
    "[" + titles.joinToString(" / ") + "]"

fun main(){
    println(joinTitles("A", "B", "C")) // 文字列を渡す
    println(joinTitles()) // 引数なしで呼び出してみる

    val xy = arrayOf("X", "Y")
    println(joinTitles(*xy)) // 配列を渡す（*は展開して渡すという意味）
}