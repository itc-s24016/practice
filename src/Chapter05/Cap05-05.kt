package Chapter05

// ループについて2 (map)
fun main() {
    val nums = listOf(1, 2, 3)
    val nums2 = nums.map { it * 10 }
    println(nums)
    println(nums2)

    // map は新しいリストとして返す
}