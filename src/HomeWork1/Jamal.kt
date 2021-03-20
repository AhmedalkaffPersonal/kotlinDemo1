package HomeWork1
// Need to use the for loop not the function
fun main()
{
    var C: Int=1
    var x:Int = 0
    x = 1

    while(x < 1000)
    {
        if(TestIsPrime(x))
            println("| " + x +" |" )
        x++
    }


}

fun TestIsPrime(x:Int):Boolean
{
    when (x)
    {
        1 ,2, 3 -> return true
        else -> {
            var y:Int =2
            while(y < x )
            {
                if(x % y == 0) {
                    return false
                }
                y++
            }
            return  true
        }
    }
}
