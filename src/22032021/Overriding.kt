package `22032021`

/*
Override can be used for methods or properties

1) Method overriding means providing the specific implementation of method of super (parent) class into
its subclass (child) class.

In other words, when subclass re-defines or modifies the method of its superclass into subclass,
 it is known as method overriding. Method overriding is only possible in inheritance.

KotlinRules of method overriding

    - Parent class and its method or property which is to be overridden must be open (non-final).
    - Method name of base class and derived class must have same.
    - Method must have same parameter as in base class.

2) Property overriding: Property of superclass can also be overridden in its subclass as similar to method
 */

open class Bird {
    // Color propriety to be open for overridden
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
    // you can't override final functions
    fun closedMethod(){

    }
}
class Parrot: Bird() {
    override var color = "Green"
    // you can't override final functions
//    override fun closedMethod(){
//
//    }
    override fun fly() {
        println("Parrot is flying...")
    }
}
class Duck: Bird() {
    override var color = "White"

    override fun fly() {
        println("Duck is flying...")
    }

    fun callfromParent(){
        // Derived class can also call its superclass methods and property using super keyword.
        println("Call from Parent")
        super.fly()
        println("Bird Color:${super.color}")
    }
}
fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    println(p.color)

    val d = Duck()
    d.fly()
    println(d.color)
    d.callfromParent()
}

