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
//          Arrays have less overhead than other data structures.
//
//Arrays have less overhead structure because items are stored at contiguous memory locations.

//        Find the maximum product - e.g.
//          Consider an input array with 5, 3, 2, 2, 5, 7 and 9
//          The maximum product is 5 * 7 = 35
//          The maximum product of -2, -1, -3, 4, -8 and 0 is 24

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySimple_MaximumProduct_Challenge {

    public static int maximumProduct(int[] arr) {

        int length = arr.length;
        int max = Integer.MIN_VALUE;

        if (length < 2) {
            System.out.println("No maximum exists, returning sentinel value");
            return max;
        }

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (arr[i] * arr[j] > max) {
                    max = arr[i] * arr[j];
                }
            }
        }

        return max;
    }

    public static int maximumProduct2(int[] arr) {

        int length = arr.length;

        if (length < 2) {
            System.out.println("No maximum exists, returning sentinel value");
            return Integer.MIN_VALUE;
        }

        Arrays.sort(arr);

        int maxProduct = arr[length - 2] * arr[length - 1];
        int minProduct = arr[0] * arr[1];

        if (maxProduct > minProduct) {
            return maxProduct;
        } else {
            return minProduct;
        }
    }

    public static int maximumProduct3(int[] arr) {
        int length = arr.length;

        if (length < 2) {
            System.out.println("No maximum exists, returning sentinel value");
            return Integer.MIN_VALUE;
        }

        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;

        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            } else if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        int maxProduct = max1 * max2;
        int minProduct = min1 * min2;

        if (maxProduct > minProduct) {
            return maxProduct;
        } else {
            return minProduct;
        }
    }

    public static void main(String[] args) {

        int[] t1 = {5, 3, 2, 5, 7, 0, 1};
        int[] t2 = {-2, -1, -3, 4, 8, 0};
        int[] t3 = {-20, -10, 3, 9, -8};

        System.out.println(maximumProduct(t1));
        System.out.println(maximumProduct(t2));
        System.out.println(maximumProduct(t3));

        System.out.println();

        System.out.println(maximumProduct2(t1));
        System.out.println(maximumProduct2(t2));
        System.out.println(maximumProduct2(t3));

        System.out.println();

        System.out.println(maximumProduct3(t1));
        System.out.println(maximumProduct3(t2));
        System.out.println(maximumProduct3(t3));
    }
}