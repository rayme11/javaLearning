package Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class NormalizedRemoveEmpty {

    String panda = " Panda";
    String fish = " FISH";
    String bird = "Bird ";
    String cat = "CAT ";
    String elephant = " ELEphant ";
    String nothing = "";

    public static void main(String[] args){



    }

    @Test
    void ShouldRemoveEmptyValues(){
        List<String> animals = List.of(panda, fish, bird, cat, elephant, nothing);

        System.out.println("Messy list:");
        animals.stream().forEach(System.out::println);

        //Trimming
        List<String> trimmed = animals.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());
        System.out.println("Trimmed values:");
        trimmed.stream().forEach(System.out::println);

        //Removing empty values
        List<String> nonEmpty = trimmed.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        //Assert no nulls are part of the list
        Assertions.assertTrue(!nonEmpty.contains(null));




    }

}
