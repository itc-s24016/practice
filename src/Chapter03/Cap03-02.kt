package Chapter03

// 関数とラムダ式
fun main(){
    // 関数（返り値なし）
    fun lambda0(){
        println("lambda0")
    }
    lambda0()

    // 返ってくる文字列を変更してみる
    val lambda1: () -> Unit = {
        println("lambda1")
    }
    lambda1()

    // 引数と返り値の型を明記しない
    val lambda2 = {
        println("lambda2")
    }
    lambda2()



    // 関数（引数あり）
    fun greet0(name: String){
        println(name + "さん、こんにちは")
    }
    greet0("みな ")

    // ラムダ式
    val greet1 = { name: String ->
        println("$name さん、こんにちは")
    }
    greet1("みな")

    // 関数（返り値あり）
    fun divide(arg1: Int, arg2: Int): Int{
        return arg1 / arg2
    }
    println(divide(10, 2))
    println(divide(arg2 = 2, arg1 = 10)) // 指定すれば順不同でもOK
}