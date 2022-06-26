package Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplyStringFunctionsSplit {

    String paragraph = "Raymundo is a super cool dude. " +
            "But he is also, working a lot of hours " +
            "Not sure how long can he sustain this." +
            "But we all know, he will get ahead, as he " +
            "usually does. " +
            "No matter what.";


    public static void main(String[] args){

    }

    @Test
    void TestParagraphLinesIsMoreThan2(){
        String[] sentences = paragraph.split("\\.");
        Assertions.assertTrue(sentences.length > 2);
    }

    @Test
    void TestParagraphHasMoreThan10Words(){
        String[] words = paragraph.split(" |-");
        Assertions.assertTrue(words.length>=2);
    }


}
