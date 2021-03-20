package HomeWork1

fun main(args: Array<String>) {
    var Start:Int = 1
    val End:Int = 100
    for (i in Start..End ) {
        var Check = false
        for (j in 2..Start / 2) {
            if (Start % j == 0) {
                Check = true
                break }
        }
        if (!Check)
            println(Start)
        ++Start }
}
