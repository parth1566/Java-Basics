package TwoDArraysQues;

public class SumOfElements {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int sum = 0;

        int [][] matrix = { {10, 20, 30},
                            {40, 50, 60},
                            {70, 80, 90} 
    };
    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
