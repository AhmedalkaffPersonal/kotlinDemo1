package `17032021`

fun main()
{
    // to call myFunction
    myFunction()
    doSome()
    sumWithReturn(10)
    sumWithReturn(10,5)
    sumWithReturn(15,3,5)
    sumWithReturn(100,8)
    sumWithReturn(10)
    sumWithReturn(y = 10)         // Named argument
    sumWithReturn(z = 10)         // Named argument

    var r:Int = sumWithReturn(1,8,9)
    println("Result :$r")
}

fun sumWithReturn(x: Int = 0, y: Int = 0, z: Int=0): Int {
    return x + y + z        // return will terminate the function
    println("This is unreachable")
}

fun sum(x: Int = 0, y: Int = 0, z:Int = 0) {
    println("x: $x, y: $y, z:$z")
    println("Result = ${x * (y + z)}")
}


fun doSome() {

}

fun myFunction()
{
    // body of function
}