package Strings;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccessDataFromStrings {

    String name = "Raymundo Maldonado Estrada";

    public static void main(String[] args){

    }

    @Test
    void NameContainsValidLastName(){
        Assertions.assertTrue(name.contains("Maldonado"));
    }

    @Test
    void NameCanBeConvertedToCharArray(){
        char[] nameCharArray = name.toCharArray();
        nameCharArray = name.toCharArray();
        Assertions.assertTrue(nameCharArray.length > 1);
    }

    @Test
    void NameFirstCharacterMustBeR(){
        Assertions.assertTrue(name.charAt(0) == 'R');
    }

    @Test
    void NameFirstThreeCharsMustBeRay(){
        Assertions.assertEquals(name.substring(0,3),"Ray");
    }

}
