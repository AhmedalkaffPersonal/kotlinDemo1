package `24032021`

/*
Kotlin null safety is a procedure to eliminate the risk of null reference from the code.
 Kotlin compiler throws NullPointerException immediately if it found any null argument is passed without
 executing any other statements.

Kotlin's type system is aimed to eliminate NullPointerException form the code.
 NullPointerException can only possible on following causes:

    1) An forcefully call to throw NullPointerException();
    2) An uninitialized of this operator which is available in a constructor passed and used somewhere.
    3) Use of external java code as Kotlin is Java interoperability.

Kotlin Nullable Types and Non-Nullable Types

Kotlin types system differentiates between references which can hold null (nullable reference)
and which cannot hold null (non null reference).
Normally,types of String are not nullable.
To make string which holds null value, we have to explicitly define them by putting a ?
behind the String as: String?

 */

fun main() {

    var str:String
    var str1: String? = "hello"
    str1 = null // ok
    //str = null      // Error

    var len = if(str1!=null) str1.length else -1
    println("str1 is : $str1")
    println("str1 length is : $len")
}