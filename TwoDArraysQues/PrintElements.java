package TwoDArraysQues;

public class PrintElements {
    public static void main(String[] args) {

        int rows = 3;
        int columns = 3;

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]);
            }
           System.out.println();
        }
    
    }
}
