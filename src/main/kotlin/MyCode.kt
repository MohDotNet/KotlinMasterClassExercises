fun main(){
    println("This is to demonstrate the Hashsets and Maps")
    println("Maps are dictionaries")


    val count = mapOf(Pair(1, "Mohamed"), Pair(2, "Sayed"), Pair(3, "Ameerodien"))
    println(count)

    // if you create an empty map you must specify the Key Type and Value Type
    val emptyMap = mapOf<Int, String>()

    // Get a value for a key
    println(count.get(2))
    // you can get a key by index as well
    println("Using the index ${count[2]}")
}
