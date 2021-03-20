package HomeWork1

import kotlin.math.sqrt

fun main()
{
    // Print the prime numbers from 1 up to 20
    // 1 , 2 , 3 , 5 , 7 , 11 ,13 ,17 , 19
    // To test if x is prime , then we need to test x/j for all numbers j from 2 to x-1
    println("====== Prime numbers ======")
    var x:Int = 0
    x = 1
    var isPrime:Boolean = false
    for(x in 1..1000)
    {
        if (x==1 || x==2 || x==3)
        {
            println(x)
        }
        else
        {
            var y:Int = 2 // set y to the starting point 2
            isPrime = true      // set the flag to true (assume that  x is prime, then we will test it)
            for(y in 2..(sqrt(x.toDouble()).toInt() ))
            {
                if(x % y == 0) {
                    isPrime = false
                    break // to stop the when loop if an y is exist
                }

            }
            if (isPrime){
                println(x)
            }

        }
    }
}