package HomeWork1
// need to use for loop and if
fun main()
{
    var x:Int = 0
    x = 1
    var y:Int = 2
    var  flag:Boolean = false
    while(x < 1000)
    {
        when (x)
        {
            1 ,2, 3 -> println(x)
            else -> {
                y =2
                flag = true
                while(y < x )
                {
                    if(x % y == 0) {
                        flag = false
                        break
                    }
                    y++
                }
                if ( flag)
                    println(x)
            }
        }
        x++
    }

}