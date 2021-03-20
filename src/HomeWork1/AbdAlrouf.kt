package HomeWork1
fun main(args : Array<String>) {
    var x: Int = 1;
    var y: Int = 0;
    var b: Boolean = true;
    for (x in 1..100) {
        b = true;
        for (y in 2..(x - 1))
            if (x % y == 0)
                b = false;
        if (b)
            println("" + x + " is Prime");
    }
}
