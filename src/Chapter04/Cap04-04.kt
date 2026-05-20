// list について（追加と削除）
fun main() {
    val items = mutableListOf("A", "B", "C")
    println("出力１回目: ${items}")
    items.add("D")
    println("出力１回目: ${items}")
    items.removeAt(1)
    println("出力１回目: ${items}")
}