package HomeWork1

fun main()
{

    var x:Int = 0
    x = 1
    var y:Int = 2
    var isPrime:Boolean = false
    // You should replace this while with for, but it is OK
    while(x < 100)
    {
        when (x)
        {
            1 ,2, 3 -> println(x)
            else -> {
                y =2
                isPrime = true
                for (i in 2..x / 2)
                {
                    if(x % y == 0) {
                        isPrime = false
                        break
                    }
                    y++
                }
                if (isPrime)
                    println(x)
            }
        }
        x++
    }


}