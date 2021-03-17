fun main()
{
    // val : can't change the value
    // var : can change the value
   // x + y = 10
    // Syntax : val <variable_id>:<type> = <value>
    var x:Int  = 10
    var y:Int = 5
    println(x + y)
    x = 20
    // Integers (Long (-9,223,372,036,854,775,808 uo to 9,223,372,036,854,775,807), Int (-2,147,483,648 up to 2,147,483,647), Short (-32,768 up to 32,767), Byte (-128 up to 127)) , (64, 32, 16, 8)

    var b:Byte = 127
    var sh:Short = -32768
    var i:Int = -2147483648
    val l:Long = 9223372036854775807
    println(b)
    println(sh)
    println(i)
    println(l)

    // Floating points numbers (Double , Float ) 64 , 32
    val d:Double = 123456.12345678910111213141516
    val f:Float = 123456.12345678910111213141516F
    val di:Double = 1525.0
    println("Float :"+ f)
    println("Double :"+ d)

    //Characters (Char)
    var ch:Char = 'A'
    println("Char :"+ch)
    ch = 'B'

    println("Char :"+ch)

    //Boolean (true/false)
    var bo:Boolean = false
    println("Boolean :"+ bo)

    // String
    var myString:String = "This is a string"
    println(myString)



}