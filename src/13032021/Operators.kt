fun main()
{
    // Arithmetic operators (+, -, *, /, %)
    var x:Int = 10
    var y:Int = 5
    var z:Int = x + y
    println(5 + 7)  // 12
    //println(5 + "7") // Error
    println("5" + 7)    // 57
    println("5" + "7")  // 57

    println("x + y = "+(x + y))
    println("x - y = "+(x - y))
    println("x * y = "+(x * y))
    println("x / y = "+(x / y))
    println("x % y = "+(10.5 % 3))

    // Assignment Operations ( = , +=, -=, *=, /=, %= )
    var n:Int = 12
    n = 20
    println("N :"+n)      // 20
    n+= 10              // n = (n + 10)
    println("N :"+n)           // 30
    n *= 2
    println("N :"+n)            // 60
    n /= 5
    println("N :"+n)            // 12
    n-= 2
    println("N :"+n)        // 10
    n *= 2 + 3              // n = n * (2+3)
    println("N :"+n)        // 50

    // Unary prefix (+),(-), (!) with Boolean
    n = -10
    var bool:Boolean = false
    println(!bool)

    // Increment / decrement ++, --

    var a:Int = 10
    var b:Int = 10
    println("++a :"+ ++a)
    a = 10
    println("a++ :"+ a++)
    println("a :"+a + ", b :"+b)

    a = 2
    b = 3
    var x1:Int = a* b - 2 * b *(a + b)/3
    // x1 = 6 - 10
    println(x1)         // -4, 9 , 0, - 15.3
     x1= a++ * b++ - 2 * b++ *(a++ + b++)/3
    println(x1)         //-15, -20, -7, -8, -21.33
    // a = 4 , b = 6
    // x1= -15

    // Comparison Operators >, < ,<=, >=, == , != (returns Boolean value)
    println(a == b)
    println(a != b)
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)

    // Logical operator || , && (used with Booleans )
    println(true || false)      //
    println(true && false)      //

    // Other operators will be introduced later
}