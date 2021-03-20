package HomeWork1

fun main(args:Array<String>) {
    // Need to re-write the same code using for loop and if
    var x:Int = 1
    val y:Int = 1000
    for (i in x..y) {
        var Check = false
        for (j in 2..x / 2) {
            if (x % j == 0) {
                Check = true
                break }
        }
        if (!Check)
            println(x)
        ++x }
}