package Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingVowelsAndConsonants {

    String name = "Raymundo Maldonado Estrada";

    public static void main(String[] args){

    }

    @Test
    void ShouldReturnVowelsOnly(){

        List<Character> vowels = new ArrayList<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] nameChar = name.toCharArray();

        int vowelsCount = 0;
        int consonantsCount = 0;
        int emptySpaces = 0;

        for(int i = 0; i <= nameChar.length - 1; i++){
          if (vowels.contains(Character.toUpperCase(nameChar[i]))) {
              vowelsCount++;
           }

          else {
              if ((nameChar[i]) == ' ' ){
                emptySpaces++;
              }
              else {
              consonantsCount++;
              }
          }
       }

       System.out.println("There are: " + vowelsCount + " Vowels \n" +
               "there are: " + consonantsCount + " consonants! \n" +
               "and there are: " + emptySpaces + " blanks");

        Assertions.assertEquals(vowelsCount, 10);

    }
}
