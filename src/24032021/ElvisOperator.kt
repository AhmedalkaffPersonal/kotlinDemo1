package `24032021`

/*
Elvis operator (?:) is used to return the not null value even the conditional expression is null.
 It is also used to check the null safety of values.

In some cases, we can declare a variable which can hold a null reference.
 Suppose that a variable str which contains null reference,
  before using str in program we will check it nullability.
  If variable str found as not null then its property will use otherwise use some other non-null value.
 */

fun main() {
    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1:  Int = if (str != null) str.length else -1
    var len2:  Int = if (str2 != null) str2.length else -1
    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
    // Kotlin provides advance operator known as Elvis operator(?:)
// which return the not null value even the conditional expression is null.
// The above if . . . else operator can be expressed using Elvis operator as bellow:
    var len3:  Int = str?.length ?: -1
    var len4:  Int = str2?.length ?:  -1
    println("Length of str is ${len3}")
    println("Length of str2 is ${len4}")

}