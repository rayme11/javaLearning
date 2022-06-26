package Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class PalindromeCheckIfAWordIsTheSameInBothOrders {

    String word1 = "civic";

    public static void main(String[] args) {

    }

    @Test
    void ShouldPassAsWordIsPalindrome() {

        String normalized = word1.toLowerCase();
        char[] normalOrder = normalized.toCharArray();
        char[] reverseOrder = new char[normalOrder.length];

        int i = 0;
        int x = 0;
        for (i = normalOrder.length - 1; i >= 0; i--) {
            reverseOrder[x] = normalOrder[i];
            x++;
        }


        String finalNormalOrder = normalOrder.toString();
        String finalReverseOrder = reverseOrder.toString();

        System.out.println(finalReverseOrder.equals(finalReverseOrder));


    }
}
