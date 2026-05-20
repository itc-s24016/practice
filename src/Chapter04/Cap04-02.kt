package Chapter04

// if 式について
fun main() {
    val number1 = 4

    // 4 / 2 で割り切れるかどうか
    val message1 = if (number1 % 2 == 0) "偶数" else "奇数"
    println("number1は $message1")

    val number2 = 7

    val message2 = if (number2 % 2 == 0) "偶数" else "奇数"
    println("number1は $message2")

    // 他の言語の if 式と違いは殆ど無い
}