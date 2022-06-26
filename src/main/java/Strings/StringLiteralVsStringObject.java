package Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringLiteralVsStringObject {

    String literalNameA = "Ray";
    String literalNameB = "Ray";

    String objectNameA = new String("Ray");
    String objectNameB = new String("Ray");

    public static void main(String[] args){

    }

    @Test
    void TestThatLiteralValueIsDifferentFromLiteralObject(){
        Assertions.assertTrue(!(literalNameA == objectNameA));
    }

    @Test
    void TestThatLiteralValueIsTheSameAsLiteralValue(){
        Assertions.assertTrue(literalNameA == literalNameB);
    }

    @Test
    void TestThatUsingEqualsMethodCanGuaranteeComparisonBetweenStringAndStringObject(){
        Assertions.assertTrue(literalNameA.equals(objectNameA));
    }
}
