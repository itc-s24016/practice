package chapter05

// null 許容型と let について
fun main() {
    val a: Int? = 5
    val b: Int? = null

//    val c = a * b // b が null なのでコンパイルエラーになる

    println("開始")
    try {
        a?.let {
            println("a は ${it * 2}")
        }
    } finally {
        println("a の処理を終了...")
    }
    try {
        b?.let {
            println("b は ${it * 2}")
        }
    } finally {
        println("b の処理を終了...")
    }
    println("終了")
}