// Java program to print frequencies of all elements

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindFrequency {
    
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 34, 5, 10, 3, 5, 10 };
        System.out.println("Input Array : " + Arrays.toString(arr));

        System.out.println("====Frequencies using HashMap====");
        Map<Integer, Integer> hmap = new HashMap<>();
        findFrequency(hmap, arr);

        System.out.println("====Frequencies using TreeMap====");
        Map<Integer, Integer> tmap = new TreeMap<>();
        findFrequency(tmap, arr);

        System.out.println("====Frequencies using LinkedHashMap====");
        Map<Integer, Integer> lmap = new LinkedHashMap<>();
        findFrequency(lmap, arr);
    }

    private static void findFrequency(Map<Integer, Integer> map, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            /*
             * get the occurence (value) in the map if already added Returns null if not
             * present
             */
            Integer c = map.get(value);

            // If this is first occurence
            if (c == null) {
                map.put(value, 1);
            } else {
                map.put(value, ++c);
            }
        }

        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            System.out.println("Frequecy of " + m.getKey() + " is " + m.getValue());
        }
    }
}