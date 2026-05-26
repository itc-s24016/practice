package Chapter05

// try-finally について
fun main(){
    var flag = false

    fun sample1(){
        try{
            flag = true
            println("処理中...")
            return
        } finally {
            flag = false
            println("finally の実行...")
        }
    }

    sample1()
    println("処理後の flag = ${flag}")

    // try が失敗しても finally は実行される
    // よく fileOpenしたあとに fileClose するために finally を使う
}