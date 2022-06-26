package Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args){

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(2, "Sandia");
        map.put(3, "Watermelon");
        map.put(4, "Frease");
        map.put(5, "Grapes");

        //Test HashMap Is Not Empty
        Boolean testHashMapIsNotEmpty = TestHashMapIsNotEmpty(map);
        if (testHashMapIsNotEmpty) { System.out.println("Test Passes"); }
    }

    public static boolean TestHashMapIsNotEmpty(HashMap<Integer, String> map){
        int itemCount = 0;
        Boolean test = false;
        for(Map.Entry m: map.entrySet()){
           //System.out.println(m.getKey()+" " + m.getValue());
           itemCount++;
       }
        System.out.println("Items in the map are: " + itemCount);
        if (itemCount > 0) { return true; }
        else { return test; }
    }


}
