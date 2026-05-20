package Chapter03

// 関数とラムダ式
fun main(){
    fun func01(param: () -> Unit){
        param()
    }

    func01(param = {println("名前付き引数として呼び出す")})

    func01({println("名前付き関数を使わず呼び出す")})

    func01() {
        println("トレーリングラムダ式")
    }

    func01 {
        println("引数が一つなら（）を省略してもいい")
    }

    fun func02(param1: String, param2: (arg: String) -> Unit){
        param2(param1)
    }

    func02("トレーリングラムダ") { arg ->
        println("引数付きラムダ式：$arg")
    }
}