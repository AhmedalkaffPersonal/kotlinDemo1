package `20032021`
/*
visibility modifiers are categorized into four different types:

    public :is accessible from everywhere in the project. It is a default modifier in Kotlin
    protected: with class or interface allows visibility to its class or subclass only
    internal :makes the field visible only inside the module in which it is implemented
    private :allows the declaration to be accessible only within the block in which properties

 */
fun main()
{
    var mo = Modifiers()
    mo.a  = 10
   // mo.b = 20           // private
   // mo.c = 10
    mo.d = 10       // In the same module

    var usr = User("Ahmed","123")
    println(usr.getCredit())
    usr.setCredit(100)
    usr.rating = -2
    println(usr.rating)
    println(usr.getCredit())
    println(usr.checkPassword("1234"))
    usr.changePasswod("1234")
    println(usr.checkPassword("1234"))
    //println(usr.Password)
}
 class User constructor(name:String, password:String, credit:Int = 0){
    public var Name:String = name
    private var Password:String = password
    private var credit:Int = credit


    fun checkPassword(pass:String):Boolean{
        return pass.equals(Password)
    }
    fun changePasswod(pass:String):Boolean{
        if(pass.length >= 3)
        {
            Password = pass
            return  true
        }
        return  false
    }

    fun setCredit(value:Int){
        if(value > 0)
            credit = value
    }

    fun getCredit():Int{ return  credit}

    var rating: Int = 5
    get() =field

    set(value) {
         when (value) {
            1, 2 , 3 ,4 ,5 -> field= value
            else -> println("Rating error")
        }
    }

}
class Modifiers {
    var a:Int = 0        // public
    private var b:Int = 0       // private
    protected  var c:Int = 10   // protected
    internal  var d:Int = 10
}
