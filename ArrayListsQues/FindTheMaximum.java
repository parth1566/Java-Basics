package ArrayListsQues;


public class FindTheMaximum {

    public static int FindTheMax(int[] inputNums) {

        int result = inputNums[0];

        for(int i = 1; i < inputNums.length; i++ ) {
            if(inputNums[i] > result) {
                result = inputNums[i];
            }
        }
        return result;
    }
    // {3, 5, 67, 13, 88}
    public static void main(String[] args) {
        int[] arr = {390, 5, 67, 13, 88};
        System.out.println(FindTheMax(arr));;
    
    }
}
