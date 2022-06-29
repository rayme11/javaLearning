package Collections;

//Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.
//
//        The important points about Java LinkedList are:
//
//        Java LinkedList class can contain duplicate elements.
//        Java LinkedList class maintains insertion order.
//        Java LinkedList class is non synchronized.
//        In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//        Java LinkedList class can be used as a list, stack or queue.
//        Allows to access data in a sequential manner
//        It uses pointer - any item points to the next item in the list
//          if it is empty, the list is at the end
//        Insertions and Deletions are less expensive than other data structures such as arrays
//        great for dynamically sized data

//            Linked Lists are dynamic data structures, making it easier to insert and delete data.
//                    Unlike arrays, we don't have to shift elements for insertion or deletion,
//                    but we just have to update the next and previous pointers.

//        Disadvantages:
//          More memory is required for storing elements in a linked list
//          Search or node traversal is still time consuming


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {

    LinkedList<String> students = new LinkedList<>();

    LinkedList_Example(){
        students.add("Raysito");
        students.add("Karen");
        students.add("Isa");
        students.add("Raymundo");
        students.add("Ray");

    }

    public static void main(){

    }

    @Test
    void TestRayIsLastItemIntheList(){
        Assertions.assertTrue(students.getLast() == "Ray");
        Assertions.assertTrue(students.contains("Ray"));
        Assertions.assertTrue(students.getLast().equals("Ray"));
    }

    @Test
    void TestItem0IsRaysito(){
        Assertions.assertTrue(students.get(0).equals("Raysito"));
    }

    @Test
    void assertLastItemInsertedWasRay(){

        students.add("LastRecord");
        Assertions.assertEquals(students.getLast(),"LastRecord");
    }

    @Test
    void assertIteratorCanBeNext(){

        Iterator i = students.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }


}
