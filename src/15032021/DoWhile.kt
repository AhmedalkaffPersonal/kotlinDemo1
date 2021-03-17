fun main()
{
    var x:Int = 5
    do {
        println(x)
    }while(x < 10)

    println("x :"+x)
    x = 5           //     restart x again to 5
    println("---------")
    while(x < 10)
        println(x++)
}