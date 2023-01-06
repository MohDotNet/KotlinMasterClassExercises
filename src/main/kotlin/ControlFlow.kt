fun main(){

    println("This file contains learning that deals with Control Flow in Kotlin!")

    /* deals with
    IF
    FOR
    WHEN

    Control flows make decisions and ultimately changes the flow of an application or piece of logic

     */

    //doSomeIFExamples()
    ifExercise()
    //doSomeWhileStatements()
}



private fun doSomeWhileStatements() {
    // THE WHILE LOOP
    // ---------------

    var counter = 0

    while (counter < 10) {
        counter++
        println("the current value of the counter is : $counter")
    }
}

private fun doSomeIFExamples() {
    // THE IF STATEMENT
    // ----------------

    var age = 14


    println("What is the student age? ")
    var enteredAge = readln() ?: "0"
    age = enteredAge.toInt()

    if (age > 15)
        println("The student is old enough!")
    else
        println("Not old enough for this grade")


    // Lets ask teh user if it is night or day
    println("Key in a boolean operator, is it night? ")
    val input = readln()
        ?: "true" // we use the elvis operator to set a default value if a null is passed.  the elvis operator is :?
    val night = input.toBoolean()

    if (night)
        println("This user specified that it is NIGHT, go sleep")
    else
        println("This user specified that it is NOT NIGHT, go be active!")
}

private fun ifExercise(){
    /* create a method to ask the user if they have the car keys.
    the input should be a boolean.
    start the car if they have the keys
     */

    println("Do you have the car keys?")
    val enteredValue = readln() ?: "false"
    val hasCarKeys = enteredValue.toBoolean()

    if (hasCarKeys)
        println("Starting car.....")
    else
        println("Cannot start car, keys is required!")

}