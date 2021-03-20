package `20032021`

fun main()
{
    val acc = Account()
    println("Account :[${acc.accountNumber}, ${acc.name},${acc.amount}]")
    acc.accountNumber = 10
    acc.name = "Ahmed"
    acc.deposit(100.0)
    println("Account :[${acc.accountNumber}, ${acc.name},${acc.amount}]")
    acc.withfraw(10.0)
    println("Account :[${acc.accountNumber}, ${acc.name},${acc.amount}]")

    val acc1 = Account()
    acc1.name = "Mahmoud"
    acc1.accountNumber = 11
    acc1.deposit(1000.0)
    println("Account :[${acc1.accountNumber}, ${acc1.name},${acc1.amount}]")
}
class Account {
    var accountNumber:Int = 0
    var name:String =""
    var amount:Double = 0.0

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