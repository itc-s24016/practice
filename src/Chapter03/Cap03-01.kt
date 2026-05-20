package Chapter03

// val と var の違い
fun main() {
    val str1 = "abc"
    println(str1)
//    str1 = "xyz" // コンパイルエラーになる

    var str2 = "def"
    str2 = "xyz"
    println(str2)

    // (value)    val:定数
    // (variable) var:変数
}