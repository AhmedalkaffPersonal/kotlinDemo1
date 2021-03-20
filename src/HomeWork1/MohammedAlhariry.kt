package HomeWork1

fun main(Args: Array<String>){
    var x1:Int=1
    var x2:Int=20
    /*do {
        println(x1)
        x1++
    } while (x1 in (1..10))
    for (x1 in (1..20)){
        if (x1%4==0){
            println(x1)
        }else{
            println("No")
        }
    }*/
    var prim:Boolean=true
    for (x2 in (1..20)) {
        if (x2 in (1..3)) {
            println(x2)
        } else {

            prim = true
            for (x1 in (2..x2)) {
                // No need to check if x1 != x2, since you can make the for loop from 2..x2-1
                if ((x1 != x2) && (x2 % x1 == 0)) {
                    prim = false
                    break
                }
            }
            if (prim) {
                println(x2)
            }
        }
    }
}