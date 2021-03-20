package HomeWork1

fun main() {
    // Not runnable
    println("====== Prime numbers ======")
    var x: Int = 0
    x = 1
    var y: Int = 2
    var isPrime: Boolean = false
    for (x < 1000)
    {
        when (x) {
            1, 2, 3 -> println(x)
            else -> {
                y = 2    // set y to the starting point 2
                isPrime = true      // set the flag to true (assume that  x is prime, then we will test it)
                for (y < x )
                {
                    if (x % y == 0) {
                        isPrime = false
                        break // to stop the when loop if an y is exist
                    }
                    y
                }
                if (isPrime)
                    println(x)
            }
        }
        x
    }
}
