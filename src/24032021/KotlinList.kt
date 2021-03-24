package `24032021`
/*
Kotlin List is an interface and generic collection of elements.
 The List interface inherits form Collection<T> class.
  It is immutable and its methods supports only read functionalities.

To use the List interface we need to use its function called listOf(), listOf<E>().

The elements of list follow the sequence of insertion order and contains index number same as array.

There are several functions are available in the List interface.
Some functions of List interface are mention below.

abstract fun contains(element: E): Boolean
    It checks specified element is contained in this collection.
abstract fun containsAll(elements: Collection<E>): Boolean
    It checks all elements specified are contained in this collection.
abstract operator fun get(index: Int): E
    It returns the element at given index from the list.
abstract fun indexOf(element: E): Int
    Returns the index of first occurrence of specified element in the list, or -1 if specified element is not present in list.
abstract fun isEmpty(): Boolean
    It returns the true if list is empty, otherwise false.
abstract fun iterator(): Iterator<E>
    It returns an iterator over the elements of this list.
abstract fun lastIndexOf(element: E): Int
    It returns the index of last occurrence of specified element in the list, or return -1 if specified element is not present in list.
abstract fun listIterator(): ListIterator<E>
    It returns a list iterator over the elements in proper sequence in current list.
abstract fun listIterator(index: Int): ListIterator<E>
    It returns a list iterator over the elements in proper sequence in current list, starting at specified index.
abstract fun subList(fromIndex: Int, toIndex: Int): List
    It returns a part of list between fromIndex (inclusive) to toIndex (exclusive).
 */
fun main() {
    var list1 = listOf("Ahmed","Ali","Fadi")//read only, fix-size
    var list2 = listOf(1,2,3,"Ahmed","Ali","Fadi",12.03,"Ahmed")//read only, fix-size
    for(element in list1){
        println(element)
    }

    println()
    for(index in 0..list2.size-1){
        println(list2[index])
    }
    println("---------")
    println(list2.get(0))
    println(list2.indexOf("Ali"))
    println(list2.lastIndexOf("Ahmed"))
    println(list2.size)
    println(list2.contains("Fadi"))
    println(list2.containsAll(list1))
    println(list2.subList(2,4))
    println(list2.isEmpty())
    println(list2.drop(1))
    println(list2.dropLast(2))

}