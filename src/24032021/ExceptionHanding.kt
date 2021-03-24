package `24032021`

import java.lang.ArithmeticException
import java.lang.Error

/*
To deal with exception you have two options
1) Prevention
2) Handling
 */
fun main() {
   try{
       var a = AccountUser()
       a.ChangePassword("152485")
       Divide(10,0)
       val arr = IntArray(5)
        arr[5] = 6


       try{

       }catch (e:Exception)
       {

       }

    }catch (e:ArithmeticException){
       println("ArithmeticException:"+ e)
       Divide(10,0)
    }
    catch (e: ArrayIndexOutOfBoundsException)
   {
       println("ArrayIndexOutOfBoundsException:"+e)
   }
    catch (e: Exception)
    {
        println("Exception:"+e)
    }
   catch (e: Error){
       println("Error:"+e)
   }
   catch (e: Throwable){
       println("Throwable:"+e)
    }
   finally {
       println("Done")
    }

    println("Competed")
}
class AccountUser{
    var Password:String = "154875"

    fun ChangePassword(pass:String)
    {
        if(testPassword(pass))
            Password = pass
        else {
            //print("password")           // Bad option
            //Password = ""               // Bad option
            // Do nothing               // Bad option
            throw InvalidPassword("Invalid password!")
        }

    }

    private fun testPassword(p:String ):Boolean {
        return p.length > 5
    }
}

class InvalidPassword(Msg:String) : Exception(Msg) {

}

fun Divide(a:Int, b:Int = 0):Int {

        return a/ b

}