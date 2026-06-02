package chapter06

// enum クラスについて
enum class TrafficSignal {
    RED,
    YELLOW,
    BLUE
}
enum class TrafficSignalMsg(val msg: String) {
    RED("止まれ"),
    YELLOW("注意して進め"),
    BLUE("進め")
}

fun main(){
    val signal1 = TrafficSignal.RED // 通常の enum
    val signal2 = TrafficSignalMsg.YELLOW // プロパティを持つ enum
    val signal3 = TrafficSignalMsg.BLUE // プロパティを持つ enum .msg付き
    println(signal1)
    println(signal2)
    println(signal3.msg)
}