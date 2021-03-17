package `15032021`

fun main()
{
    // Print the prime numbers from 1 up to 20
    // 1 , 2 , 3 , 5 , 7 , 11 ,13 ,17 , 19
    // To test if x is prime , then we need to test x/j for all numbers j from 2 to x-1
    println("====== Prime numbers ======")
    var x:Int = 0
    x = 1
    var y:Int = 2
    var flag:Boolean = false
    while(x < 1000)
    {
        when (x)
        {
            1 ,2, 3 -> println(x)
            else -> {
                y =2    // set y to the starting point 2
                flag = true      // set the flag to true (assume that  x is prime, then we will test it)
                while(y < x )
                {
                    if(x % y == 0) {
                        flag = false
                        break // to stop the when loop if an y is exist
                    }
                    y++
                }
                if (flag)
                    println(x)
            }
        }
        x++
    }

    //TODO: Re-write the code above using For loop and if-else
}