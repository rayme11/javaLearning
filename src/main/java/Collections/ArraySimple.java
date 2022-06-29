package Collections;

//Java ArrayList class can contain duplicate elements.
//        Java ArrayList class maintains insertion order.
//        Java ArrayList class is non synchronized.
//        Java ArrayList allows random access because the array works on an index basis.
//        In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
//        We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:
//        ArrayList<int> al = ArrayList<int>(); // does not work
//        ArrayList<Integer> al = new ArrayList<Integer>(); // works fine

//        Use Arrays when you need a collection that won't change in size

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraySimple {

    String[] availablePets = {"Cat", "Dog", "Elephant", "Mouse", "Tiger"};
    String[] nonAvailablePets = {"Scorpion", "Lizard", "Snake", "Turtle"};

    public static void main(String[] args){

    }

    @Test
    void mustContainCat(){
        String myFavAnimal = Arrays.toString(availablePets);
        Assertions.assertTrue(myFavAnimal.contains("Cat"));
    }

    @Test
    void CatnAndLizardMustChangeValuesInArray(){

        int indexOfCat = 0;
        int indexOfLizard = 1;

        String catValue = availablePets[indexOfCat];
        String lizardValue = nonAvailablePets[indexOfLizard];

        availablePets[indexOfCat] = lizardValue;
        nonAvailablePets[indexOfLizard] = catValue;

        Assertions.assertTrue(nonAvailablePets[1] == "Cat");

    }
}
