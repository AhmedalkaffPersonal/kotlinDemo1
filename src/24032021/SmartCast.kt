package `24032021`

/*
Smart cast is a feature in which Kotlin compiler tracks conditions inside if expression.
 If compiler founds a variable is not null of type nullable then the compiler will allow to access the variable.

 Smart cast work according to the following conditions:
    1) A val variable always aspect for local properties.
    2) If a val property is private or internal the check is performed in the same module where the property is declared.
    3) If the local var variable is not modified between the check and the usage,
     is not captured in a lambda that modifies it.

 */

fun main() {
    var string: String? = "Hello!"
    // print(string.length) // Compile error
    if(string != null) { // smart cast
        print(string.length) // It works now!
    }

    // While using is or !is for checking the variable,
    // the compiler tracks this information and internally cast the variable to target type.
    // This is done inside the scope if is or !is returns true.
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj is String) {
        // No Explicit Casting needed.
        println("String length is ${obj.length}")
    }
}