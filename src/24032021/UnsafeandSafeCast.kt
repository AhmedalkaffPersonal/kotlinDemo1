package `24032021`

/*
Sometime it is not possible to cast variable and it throws an exception,
this is called as unsafe cast. The unsafe cast is performed by the infix operator as.

Kotlin provides a safe cast operator as? for safely cast to a type.
It returns a null if casting is not possible rather than throwing an ClassCastException exception.
 */

fun main() {
    // A nullable string (String?) cannot be cast to non nullabe string (String), this throw an exception.
    val obj: Any? = null
//    val str: String = obj as String
//    println(str)

    val obj1: Any = 123
//    val str1: String = obj1 as String

//    println(str1)
    //  trying to cast Any type of string value which is initially known by programmer
    //  not by compiler into nullable string and nullable int.
    //  It cast the value if possible or return null instead of throwing exception even casting is not possible.
    val location: Any = "kotlin"
    val intValue: Any = 1239632565652
    val safeString: String? = location as? String
    val safeInt: Int? = intValue as? Int
    println(safeString)
    println(safeInt)
}