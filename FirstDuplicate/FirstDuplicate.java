import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 2, 4, 3, 5, 6, 7, 8, 5 };

        Set<Integer> set = new HashSet<>();

        int firstDuplicate = -1;
        int indexOfFirstDuplicate = -1;

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (set.add(value)) {
                set.add(value);
            } else {
                firstDuplicate = value;
                indexOfFirstDuplicate = i;
                break;
            }
        }

        System.out.println("First Duplicate on Index = " + indexOfFirstDuplicate + " Value = " + firstDuplicate);

    }
}