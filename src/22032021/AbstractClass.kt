package `22032021`
/*
 An abstract class cannot be instantiated directly.
 Means, we cannot create object of abstract class directly

 Abstract classes are partially defined classes, methods and properties which are no implementation
 but must be implemented into derived class.
 If the derived class does not implement the properties of base class then is also meant to be an abstract class.

 Abstract member function does not contain its body

 The member function cannot be declared as abstract if it contains in body in abstract class.
 A non-abstract open member function can be overridden in an abstract class.
 */
abstract class Item{
    constructor(){
        println("abstract constructor")
    }
    var x = 0
    abstract  fun doSomething()
    fun finalNonAbstract(){
        println("Final non-abstract function in abstract class")
    }
    open fun openNonAbstract(){
        println("Open non-abstract function in abstract class")

    }
}
class ChildFromAbstract: Item() {
    override fun doSomething() {
        println("doSomething")
    }

    override fun openNonAbstract() {
        println("ChildFromAbstract:openNonAbstract")
    }

}
fun main() {
    val a = ChildFromAbstract()

}