package HomeWork1

fun main(args: Array<String>) {


    for (i in 1..100) {
        var p = 1
        var k = 2
        // You should use for loop her also, but it is OK.
        while (k < i) {
            if (i % k == 0) {
                p = 0
                break
            }
            k++
        }
        if (p == 1) {
            println(i)
        }
    }
}