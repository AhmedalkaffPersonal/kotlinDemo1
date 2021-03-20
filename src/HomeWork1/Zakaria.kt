package HomeWork1

fun main( )
{
    println("Zakaria_Alkilani")
    var x:Int = 1
    var y:Int = 0
    label@ for( x in 1 .. 20)
    {
        for( y in 2..(x-1))
            if (x % y ==0)
                continue@label
        println(x)

    }

}
