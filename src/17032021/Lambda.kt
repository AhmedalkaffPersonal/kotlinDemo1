package `17032021`

// Lambda : is a function with no name
// Syntax: variable -> body
fun main()
{
    sum(10,5)

    val Mylambda: (Int) -> Unit  = {s:Int -> println(s)}
    val Mylambda1: (Int, Int) -> Unit  = {x:Int, y:Int -> println("$x + $y = ${x + y}") }
    val Mylambda2: (Int, Int) -> Int  = {x:Int, y:Int ->  x + y }
    sumWithLambda(10,5,Mylambda)
    sumWithLambda(10,5,Mylambda1)
    sumWithLambda1(10,5,Mylambda2)
}
fun sumWithLambda(a:Int,b:Int,lambda:(Int) -> Unit)
{
    lambda(a + b)
}

fun sumWithLambda(a:Int,b:Int,lambda:(Int,Int) -> Unit)
{
    lambda(a,b)
}

fun sumWithLambda1(a:Int,b:Int,lambda:(Int,Int) -> Int)
{
    var result:Int = lambda(a,b)
    println("Result : $result")
}

fun sum(x:Int =0 , y:Int = 0)
{
    println("$x + $y = ${x + y}")
}