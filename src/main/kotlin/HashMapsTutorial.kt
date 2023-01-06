fun main(){
    // hash maps allow you to add items to a map.
    // you call the put method.

    val cars = hashMapOf(Pair(1, "Toyota"), Pair(2, "Nissan"))
    println(cars)

    // add an item
    cars.put(3,"BMW")
    println(cars)

    if (cars.isNotEmpty())
    {
        if (cars.containsValue("BMW")){
            println("Yes it does!")
        }
        println("This cars variable contains ${cars.count()} items in it.")
    }


    // Exercise
    var translations = hashMapOf(Pair(1,"un"),Pair(2,"deux"), Pair(3,"Trois"))

    // translate 2
    println("2 in french is translated as ${translations.get(2)}") // using hte get method.
    // translate 3
    println("3 in french is translated as ${translations[3]}") // using the index
    // add 4 to the translation
    translations.put(4,"Catech")
    // print the whole map
    println(translations)


    var attendance = hashMapOf(Pair("23 Sept",2837), Pair("24 Sept", 3726), Pair("25 Sept",6253))
    // add a value for 26
    attendance.put("26 Sept", 786)
    val totalAttendance = (attendance.getValue("25 Sept") + attendance.getValue("26 Sept"))
    println("Total attendance for 25 and 26 : $totalAttendance")

    println("Are there data for the 22 Sept : ${attendance.containsKey("22 Sept")}")

}