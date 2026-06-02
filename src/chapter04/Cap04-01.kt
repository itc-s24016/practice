package chapter04

// 論理演算子について
fun main(){
    var a = 3
    val b = 3
    val c = 3

    val and1 = (a == b) && (b == c) // かつ
    val or1 = (a == b) || (b == c) // または

    println("a 変更前 and = ${and1}")
    println("a 変更前 or = ${or1}")

    a = 2

    val and2 = (a == b) && (b == c)
    val or2 = (a == b) || (b == c)

    println("a 変更後 and = ${and2}")
    println("a 変更後 or = ${or2}")

    // ほかの言語の論理演算子と違いは殆ど無い
}