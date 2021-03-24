package `24032021`

fun main() {
    val map = mapOf<Int,String>(7885478 to "Ahmed", 558524 to "Ali", 954554 to "Fadi",7885477 to "Ahmed" )

    for (key in map.keys)
        println("${map[key]}:$key")

    val mutablemap = mutableMapOf<Int,String>(7885478 to "Ahmed", 558524 to "Ali", 954554 to "Fadi",7885477 to "Ahmed")
    mutablemap.put(525,"New")
    for (value in mutablemap.values)
        println(value)

    println(mutablemap.get(5854))
    println(mutablemap.getOrDefault(5854,"No data found"))
}