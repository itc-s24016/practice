package chapter07

// when の引数なしバージョンを試してみる
fun describe(a: Int, b: Int): String = when{
    a >= b -> "a greater or equal"
    a == b -> "equal"
    else -> "a less than"
}
fun main(){
    println(describe(a = 5, b = 3))
    println(describe(a = 3, b = 3))
    println(describe(a = 2, b = 4))
}