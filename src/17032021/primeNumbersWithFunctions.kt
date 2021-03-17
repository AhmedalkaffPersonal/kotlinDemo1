package `17032021`
fun main()
{
    // Print the prime numbers from 1 up to 20
    // 1 , 2 , 3 , 5 , 7 , 11 ,13 ,17 , 19
    // To test if x is prime , then we need to test x/j for all numbers j from 2 to x-1
    println("====== Prime numbers ======")
    var x:Int = 0
    x = 1
    while(x < 1000)
    {
        if(TestIsPrime(x))
            println(x)
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