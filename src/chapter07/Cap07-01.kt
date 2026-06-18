package chapter07

// コンパニオンオブジェクトについて
class Ticket1 {
    companion object {
        const val PREFIX = "TK-"
        fun code(id:Int): String = PREFIX + id
    }
}

class Ticket2 {
    val prefix = "TK-"
    fun code(id:Int): String = prefix + id
}
fun main(){
    // クラス名、関数名で呼び出せる
    println(Ticket1.code(123))
    // クラスのインスタンスを作成して呼び出す
    println(Ticket2().code(456))
}