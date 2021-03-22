package `22032021`

open class Parent {
    constructor(id:Int)
    {
        println("Parent:($id)")
    }
    constructor(id:Int,name:String):this(id)
    {
        println("Parent:($id,$name)")
    }
}
// Note: We used the based class name without ()
class Child: Parent {
    constructor(id:Int):super(id) {
        println("Child:($id)")
    }

    // this keyword will call a constructor from the same class
    constructor(id:Int,name: String):this(id,name,"Other") {
        println("Child:($id,$name)")
    }

    constructor(id:Int,name: String,other:String):super(id,name) {
        println("Child:($id,$name,$other)")
    }
}

fun main() {
    val parent = Parent(1)
    println("---------------------")
    val parent1 = Parent(2,"Parent")
    println("---------------------")
    val child1 = Child(3)
    println("---------------------")
    val child2 = Child(4,"child 2")
    println("---------------------")
    val child3 = Child(5,"child 3","Other")
}