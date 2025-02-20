fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value > 2 }
    println(map) // Output: {a=1, b=2}

    // This will not compile
    // val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    // set.removeIf { it > 2 } 
}