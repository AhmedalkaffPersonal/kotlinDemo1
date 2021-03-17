fun main()
{
    for (i in 1..10)            // for(int i=0;i< 10;i++)
        println(i)

    println("--------------")
    for(i in 10 downTo 1)
        println(i)
    println("--------------")
    for (i in 1..10 step 2)
        println(i)

    println("--------------")
    for (i in 0..10 step 2)
        println(i)

    println("--------------")
    for(i in 10 downTo 1 step 3)
        println(i)
}
