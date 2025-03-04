import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt(); // input for number of rows
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt(); // input for number of columns
        
        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];
        
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt(); // input for 2D array
            }
        }
        
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; // storing the elements in 1D array
            }
        }
        
        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // display the elements of 1D array
        }
        System.out.println();
    }
}
