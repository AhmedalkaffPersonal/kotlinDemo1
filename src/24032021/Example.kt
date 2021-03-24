package `24032021`

import kotlin.random.Random

interface Flyable{
    fun fly()
}
open class Animal {
    override fun toString(): String {
        return "Animal"
    }

}
open class Mammal :Animal(){
    override fun toString(): String {
        return "Mammal"
    }
}
open class Bird1:Animal(){
    override fun toString(): String {
        return "Bird"
    }
}

class Cat :Mammal(){
    override fun toString(): String {
        return "Cat"
    }
}
class Bat:Mammal(), Flyable{
    override fun toString(): String {
        return "Bat"
    }
   override fun fly(){
       println(", It's flying...")
    }
}

class Penguin:Bird1(){
    override fun toString(): String {
        return "Penguin"
    }
}
class Falcon:Bird1(), Flyable{
    override fun toString(): String {
        return "Falcon"
    }

    override fun fly(){
        println(", It's flying...")
    }
}

open class Vehicle {
    override fun toString(): String {
        return "Vehicle"
    }
}

class Car:Vehicle(){
    override fun toString(): String {
        return "Car"
    }
}
class Plane:Vehicle(),Flyable {
    override fun fly() {
        println(", It's flying...")
    }
    override fun toString(): String {
        return "Plane"
    }
}

class Train:Vehicle(){

}
fun main() {
    val n: Int = 50

    val objects = ArrayList<Any>(n)
    for(i in 1..n)
    {
        objects.add(when (Random.nextInt(1,10)){
            1 -> Animal()
            2 -> Bird1()
            3 -> Penguin()
            4 -> Falcon()
            5 -> Cat()
            6 -> Bat()
            7 -> Mammal()
            8 -> Plane()
            9 -> Train()
            10 -> Car()
            else -> Vehicle()
        })
    }
//   objects.add(Animal())
//    objects.add(Bird1())
//    objects.add(Penguin())
//    objects.add(Falcon())
//    objects.add(Cat())
//    objects.add(Bat())
//    objects.add(Mammal())
//    objects.add(Vehicle())
//    objects.add(Plane())
//    objects.add(Train())
//    objects.add(Car())
    for (item in objects) {
        print(item)
        // Smart cast
        if(item is Flyable)
            item.fly()
        else
            println("")
    }
}