package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_TestItemExist {

    int key;
    String value;
    static HashMap<Integer, String> map = new HashMap<Integer, String>();

    static Boolean test = false;

    HashMap_TestItemExist(int i, String n){
        try {
          map.putIfAbsent(i, n);
            test = true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args){
       HashMap_TestItemExist hashMapObjectWaterMelon = new HashMap_TestItemExist(6, "Watermelon");
       HashMap_TestItemExist hashMapObjectLemon = new HashMap_TestItemExist(1, "Lemon");
       HashMap_TestItemExist hashMapObjectOrange = new HashMap_TestItemExist(2, "Orange");
        HashMap_TestItemExist hashMapObjectApples = new HashMap_TestItemExist(2, "Apples");

       if (test) {
           System.out.println("The test passes,, objects were inserted, only 3 unique keys");

           for(Map.Entry m: map.entrySet()){
               System.out.println(m.getKey() + " "+ m.getValue());
           }
       }

    }


}
