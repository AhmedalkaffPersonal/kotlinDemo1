package `24032021`

fun main() {
    val set = setOf(2,5,7,9,3,2)
    val setAny = setOf<Any>(2,5,7,9,3,2,"Ahmed","Ali","Ahmed")
    val mutableSet = mutableSetOf<Int>(2,5,7,9,3,2)
    val mutableAnySet = mutableSetOf(2,5,7,9,3,2,"Ahmed","Ali","Ahmed")


    for (i in set)
        print("$i, ")

    println()
    for (i in setAny)
        print("$i, ")
}