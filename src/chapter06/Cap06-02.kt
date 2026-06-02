package chapter06

// when について
enum class TrafficSignal2 {
    RED,
    YELLOW,
    BLUE
}
fun main(){
    // if
    val signal1 = TrafficSignal2.BLUE
    if (signal1 == TrafficSignal2.RED) {
        println("$signal1 は止まれ")
    } else if (signal1 == TrafficSignal2.YELLOW) {
        println("$signal1 は止まれ")
    } else {
        println("$signal1 は進んでもいい")
    }

    // when
    val signal2 = TrafficSignal2.RED
    when (signal2) {
        TrafficSignal2.RED, TrafficSignal2.YELLOW -> {
            println("$signal2 は止まれ")
        }
        TrafficSignal2.BLUE -> {
            println("$signal1 は進んでもいい")
        }
    }
}