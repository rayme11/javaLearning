package Common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticVsNonStatic {

    private static int count = 0;

    private static int incrementCounter(){
        return ++count;
    }

    private String displayCounter(){
        return " \n This was sent back from a private non-Static method " + incrementCounter();
    }

    public static void main(String[] args){
        System.out.println(incrementCounter());

        StaticVsNonStatic  staticVsNonStatic = new StaticVsNonStatic();
        System.out.println("The value from non static method was accessed \n" +
                "by an instant of the class, then calling the method " + staticVsNonStatic.displayCounter());
    }

    @Test
    void TestValueIsGreaterThanZero(){
        incrementCounter();
        Assertions.assertTrue(count > 0);
    }
}
