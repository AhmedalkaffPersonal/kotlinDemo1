package `22032021`

/*
 An interface is a blueprint of class.
 It contains abstract method declarations as well as implementation of method.

 Why use interface?
    1) Using interface supports functionality of multiple inheritance.
    2) It can be used achieve to loose coupling.
    3) It is used to achieve abstraction.
Subclass extends only one super class but implements multiple interfaces.
 Extension of parent class or interface implementation are done using (:) operator in their subclass.
 */

interface MyInterface {
    val id: Int     // abstract property
    fun abstractMethod():String// abstract method
    fun nonAbstractMethod() {
        println("nonAbstractMethod")
        // optional body
    }
}

interface MyInterface1 {
   var Counter: Int
   fun doSome()
}


class InterfaceImp : Parent(1,""), MyInterface , MyInterface1{
    override var id: Int = 101
    override var Counter: Int = 0
    override fun doSome() {
        println("DoSome")
    }

    override fun abstractMethod(): String{
        return "Implementing abstract method.."
    }



}

fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("Calling overriding id value = ${obj.id}")
    obj.nonAbstractMethod()
    obj.doSome()
    println(obj.abstractMethod())



}