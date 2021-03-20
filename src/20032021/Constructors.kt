package `20032021`

/*
There are two types of constructors in Kotlin:

    Primary constructor
    Secondary constructor

There is only one primary constructor in a Kotlin class whereas secondary constructor may be one or more.
 */
fun main()
{
    val acc = AccounteWithPrimaryConstructor(10,"Ahmed",100.0)
    println("Account :[${acc.accountNumber}, ${acc.name},${acc.amount}]")
    println("Account :[${acc.accountNumber}, ${acc.name},${acc.amount}]")
    acc.withfraw(10.0)
    println("Account :[${acc.accountNumber}, ${acc.name},${acc.amount}]")

    val acc1 = AccounteWithPrimaryConstructor(11,"Mahmoud",1000.0)
//    println("Account :[${acc1.accountNumber}, ${acc1.name},${acc1.amount}]")
    println(acc1)
    var acc3 = AccounteWithSecondaryConstructor(10)
    println(acc3)
//    println("Account :[${acc3.accountNumber}, ${acc3.name},${acc3.amount}]")
    var acc4 = AccounteWithSecondaryConstructor("Ali")
    println(acc4)
//    println("Account :[${acc4.accountNumber}, ${acc4.name},${acc4.amount}]")
    var acc5 = AccounteWithSecondaryConstructor(100.0)
    println(acc5)
    //println("Account :[${acc5.accountNumber}, ${acc5.name},${acc5.amount}]")
    var acc6 = AccounteWithSecondaryConstructor(15,"Test",100.0)
    //println("Account :[${acc6.accountNumber}, ${acc6.name},${acc6.amount}]")

    println(acc6)  // the same as  println(acc6.toString())

}
// primary constructor
class AccounteWithPrimaryConstructor constructor(number:Int = 0,name:String= "",amount:Double = 0.0){
    var accountNumber:Int
    var name:String
    var amount:Double

    init{
        // Init block can contains any code statements
        println("init block")
        if(number > 0)
            accountNumber = number      // or this.accountNumber = name
        else
            accountNumber = 0
        this.name = name
        // this.amount = amount
    }
    init {
        println("init block 1")
        // You can have many init blocks
        this.amount = amount
    }



    fun deposit(value:Double)
    {
        amount+= value
    }

    fun withfraw(value:Double)
    {
        amount-=value
    }

    fun checkBalance():Double
    {
        return  amount
    }

}

class AccounteWithSecondaryConstructor {
    var accountNumber:Int = 0
    var name:String = ""
    var amount:Double = 0.0

    // secondary constructor
    constructor(number:Int){
        accountNumber = number
    }
    constructor(name:String){
        this.name = name
    }
    constructor(amount: Double){
        this.amount = amount
    }
    constructor(number:Int,name:String,amount: Double){
    accountNumber = number
        this.name = name
        this.amount = amount
    }

    fun deposit(value:Double)
    {
        amount+= value
    }

    fun withfraw(value:Double)
    {
        amount-=value
    }

    fun checkBalance():Double
    {
        return  amount
    }

    override fun toString(): String {
        return "Account:[Number:${accountNumber}, Name:${name},Amount:${amount}]"
    }

}