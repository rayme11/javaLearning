package Strings;

//String buffer and StringBuilder both are mutable classes which can be used to do operation on string objects such as reverse
//        of string, concating string and etc. We can modify string without creating a new object of the string. A string buffer is thread-safe
//        whereas string builder is not thread-safe.  Therefore, it is faster than a string buffer.
//        Also, a string concat + operator internally uses StringBuffer or StringBuilder class.

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringObjectsMoreEfficientOptions {
    StringBuilder my_stringBuilder = new StringBuilder("Ray ");
    StringBuffer my_stringBuffer = new StringBuffer("Karen ");

    public static void main(String[] args){
        System.out.println("Running application...");

  }

    @Test
    void TestNameIsCorrect() {

        my_stringBuilder.append("Maldonado");
        my_stringBuffer.append("Maldonado");
        System.out.println("The name is " + my_stringBuilder.toString());
        System.out.println("The name is " + my_stringBuilder.toString());
        Assertions.assertEquals(my_stringBuilder.toString(), "Ray Maldonado");
        Assertions.assertEquals(my_stringBuffer.toString(), "Karen Maldonado");

    }








}
