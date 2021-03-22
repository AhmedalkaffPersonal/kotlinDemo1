package `22032021`

/*
Inheritance is an important feature of object oriented programming language.
Inheritance allows to inherit the feature of existing class (or base or parent class)
to new class (or derived class or child class).

The main class is called super class (or parent class) and the class which inherits the
superclass is called subclass (or child class). The subclass contains features of superclass
as well as its own.

The concept of inheritance is allowed when two or more classes have same properties.
It allows code reusability. A derived class has only one base class but may have multiple interfaces
whereas a base class may have one or more derived classes.

In Kotlin, the derived class inherits a base class using : operator in the class header
(after the derive class name or constructor)

*/

open class Base {
    //When we inherit a class to derive class, all the fields and functionalities are inherited.
    //We can use these fields and functionalities in derived class.
    var x = 10
    fun functionInBase()
    {
      println("This function in the Base class, it will be inherited in all sub-classes (Derived classes)")
    }
}
class Derived : Base() {
    fun functionInDerived()
    {
        println("This function in the Derived class.")
    }
}
/*
As Kotlin classes are final by default, they cannot be inherited simply.
We use the open keyword before the class to inherit a class and make it to non-final
 */

open class Person(id:Int= 0, name:String = ""){

    var Id:Int = id
    var Name:String = name

    override fun toString(): String {
        return "Person [Id:$Id, Name:$Name]"
    }
}
open class Student (id:Int,name:String,major:String):Person(id,name)
{
    var Major:String = major

    override fun toString(): String {
        return "Student [Id:$Id, Name:$Name, Major:$Major]"
    }

}
class PaidStudent (id:Int,name:String,major:String,salary:Double):Student(id,name,major){
    var Salary:Double = salary

    override fun toString(): String {
        return "PaidStudent [Id:$Id, Name:$Name, Major:$Major, Salary:$Salary]"
    }
}

class Employee (id:Int,name:String,salary:Double) :Person(id,name){
    var Salary:Double = salary

    override fun toString(): String {
        return "Employee [Id:$Id, Name:$Name, Salary:$Salary]"
    }
}

fun main(args:Array<String>){
    // using object of base class
    var base = Base()
    base.functionInBase()

    // using object of derived class
    var derived = Derived()
    derived.x = 20
    derived.functionInBase()
    derived.functionInDerived()

    val p = Person(1,"Person")

    val s = Student(2,"Student","CS")

    val e = Employee(3,"Employee",1200.0)

    var ps = PaidStudent(4,"PaidStudent","Math",250.0)

//    println(p.toString())
//    println(s.toString())
//    println(e.toString())
//    println(ps.toString())

    val people = listOf<Person>(p,s,e,ps)
    for (a in people)
        println(a.toString())



}