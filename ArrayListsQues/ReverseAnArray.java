package ArrayListsQues;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAnArray {
    public static void ReversedArray(ArrayList<Integer> inputArray) {
        int left = 0;
        int right = inputArray.size() - 1;

        while(left < right) {
            int temp = inputArray.get(left);
            inputArray.set(left, inputArray.get(right));
            inputArray.set(right, temp);

            left++;
            right--;
        }
        System.out.println(inputArray);
    }
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    ReversedArray(list);
}
}



