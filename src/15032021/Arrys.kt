fun main()
{
    val numbers:IntArray = intArrayOf(8,7,3,9,5,6)
    println(numbers.toString())
    for(i in numbers)
        println(i)

    numbers[2] = 10
    val arr = IntArray(5)  // [0, 0, 0 , 0 ,0]
    val arr1 = IntArray(5) {5} // [5, 5, 5 , 5 ,5]
    for(i in arr)
        println(i)

    println("Print with index")
    for((index,value) in numbers.withIndex()) {
//        println("value :"+ value)
//        println("value :${value}")
        println("$index:$value")
        //println("" + index + ":" + value)
    }


    var arrFrom1To100 = IntArray(100)
    var x:Int = 0
    for (i in arrFrom1To100)
        arrFrom1To100[x++] = x

    for(i in arrFrom1To100)
        print("$i, ")

    println()
    var arrFrom1To10 = IntArray(100) {it  * 2 + 1}
    for(i in arrFrom1To10)
        print("$i, ")

}