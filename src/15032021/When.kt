fun main()
{
    // when

    var x:Int = 5
    when (x)
    {
        1, 5 -> println("One")          // if x == 1 Or x == 5
        2 -> {
            println("Two")
            x++
        }
        else ->
        {
            println("Others")
        }
    }

    // you can convert any when statement using if
}