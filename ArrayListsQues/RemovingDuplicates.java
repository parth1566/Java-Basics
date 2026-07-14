package ArrayListsQues;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicates {
    public static void NoDuplicates(ArrayList<Integer> inputArray) {
        for(int i = 0; i < inputArray.size(); i++) {
            for(int j = i + 1; j < inputArray.size(); j++){
                if(inputArray.get(i).equals(inputArray.get(j))) {
                    inputArray.remove(j);
                    j--;
                }
            }
        }
        System.out.println(inputArray);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 5, 3, 1, 5, 7));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(300, 5, 300));
        NoDuplicates(arr);
        NoDuplicates(arr2);
    }
}
//[3, 5, 3, 1, 5, 7] 
