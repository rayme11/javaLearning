package Strings;

//Use + to add String values
//Use  concat() method to add strings
// Remember Strings are immutable - to create a new String, 2 or more already
// existing String objects need to be concatenated

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class NormalizeString {

    static String name = "Ray";
    static String last = "Maldonado";

    String panda = " panda";
    String fish = " fish ";
    String horse = "Horse ";
    String cat = "CAT";
    String nothing = "";


    public static void main(String[] args){

        System.out.println(name.concat(" ").concat(last));

    }

    @Test
    void TestFirstValueIsNormalized(){

        List<String> animals = List.of(panda, fish, horse, cat, nothing);
        //Build the list
        List<String> trimmed = animals.stream()
                        .map(s -> s.trim())
                                .collect(Collectors.toList());

        //Further removing empty value in the list
        List<String> realAnimals = trimmed.stream()
                        .filter(s -> !s.isEmpty())
                                .collect(Collectors.toList());

        //To Lowercase
        List<String> normalizedAnimals = realAnimals.stream()
                        .map(s -> s.toLowerCase())
                                .collect(Collectors.toList());

        System.out.println(animals.get(0).toString());
        Assertions.assertEquals("panda", normalizedAnimals.get(0).toString());

    }


}


