package TwoDArraysQues;

import java.util.Arrays;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalElements = rows * cols;

        int[] result = new int[totalElements];
        int index = 0;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for(int j =left; j <= right; j++) {
                result[index] = matrix[top][j];
                index++;
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                result[index] = matrix[i][right];
                index++;
            }
            right--;

            for(int j = right; j >= left; j--) {
                result[index] = matrix[bottom][j];
                index++;
            }
            bottom--;

            for(int i = bottom; i >= top; i--) {
                result[index] = matrix[i][left];
                index++;
            }
            left++;
           
        }
         System.out.println(Arrays.toString(result));
        
    }
}
