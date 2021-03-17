fun main(args: Array<String>)
{
    // If else

    // Syntax: if (<boolean_condition>) <true_statement> [else <false_statement>]
    var a:Int  = 11
    if (a > 5 && a < 10)
        println("A is greater than 5")
    else {
        println("A is less than 5")
        println("Hello")
    }

    println("---------------")
    a = 1

    if (a == 1) {
        println("One")
        a++
    }
    else if (a == 2)
        println("Two")
    else  if (a == 3)
        println("Three")
    else
        println("Other")

    println("---------------")
    if (a == 1)
        println("One")

    if (a == 2)
        println("Two")
    if (a == 3)
        println("Three")
    else
        println("Other")



}