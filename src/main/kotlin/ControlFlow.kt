fun main(){

    println("This file contains learning that deals with Control Flow in Kotlin!")

    /* deals with
    IF
    FOR
    WHEN

    Control flows make decisions and ultimately changes the flow of an application or piece of logic

     */

    // THE IF STATEMENT
    // ----------------

    val age : Int = 14

    if(age > 15 )
        println("The student is old enough!")
    else
        println("Not old enough for this grade")


    // THE WHILE LOOP
    // ---------------

    var counter : Int = 0

    while (counter < 10)
    {
        counter++
        println("the current value of the counter is : $counter")
    }
}