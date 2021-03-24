package `24032021`

/*
MutableList is an interface and generic collection of elements.
 MutableList interface is mutable in nature. It inherits form Collection<T> class.
 The methods of MutableList interface supports both read and write functionalities.
 Once the elements in MutableList have declared, it can be added more elements in it or removed,
 so it has no fixed size length.

To use the MutableList interface we use its function called mutableListOf() or mutableListOf<E>().

The elements of MutableList follow the sequence of insertion order and contains index number same as array.

There are several methods are available in MutableList interface.
 Some methods of MutableList interface are mention below.

abstract fun add(element: E): Boolean
    It adds the given element to the collection.
abstract fun add(index: Int, element: E)
    It adds the element at specified index.
abstract fun addAll(elements: Collection<E>): Boolean
    It adds all the elements of given collection to current collection.
abstract fun clear()
    It removes all the elements from this collection.
abstract fun listIterator(): MutableListIterator<E>
    It returns a list iterator over the elements in proper sequence in current list.
abstract fun listIterator(index: Int): MutableListIterator<E>
    It returns a list iterator starting from specified index over the elements in list in proper sequence.
abstract fun remove(element: E): Boolean
    It removes the specified element if it present in current collection.
abstract fun removeAll(elements: Collection<E>): Boolean
    It removes all the elements from the current list which are also present in the specified collection.
abstract fun removeAt(index: Int): E
    It removes element at given index from the list.
abstract fun retainAll(elements: Collection<E>): Boolean
    It retains all the elements within the current collection which are present in given collection.
abstract operator fun set(index: Int, element: E): E
    It replaces the element and add new at given index with specified element.
abstract fun subList(fromIndex: Int,toIndex: Int): MutableList<E>
    It returns part of list from specified fromIndex (inclusive) to toIndex (exclusive) from current list.
     The returned list is backed by current list, so non-structural changes in the returned list are reflected in current list, and vice-versa.
 */

fun main() {
    var mutableList = mutableListOf<Any>("Ahmed","Ali","Fadi","Dana",1)

    for(element in mutableList){
        println(element)
    }
    println("----------------")
    mutableList.add("Areej")
    mutableList.add("Salaeh")
    mutableList.add(8.65)
    mutableList.add(18)
    mutableList.add(18.65)

    println()
    for(index in 0..mutableList.size-1){
        println(mutableList[index])
    }

    var sum:Int = 0
    var sumDouble:Double = 0.0
    for(item in mutableList)
    {
        if(item is Int)
            sum += item
        if(item is Double)
            sumDouble += item
    }

    println("Sum =$sum")
    println("Sum double = $sumDouble" )




}