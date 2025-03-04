import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] heights = new double[11];
        double sum = 0.0;
        
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) { // taking the user input
            heights[i] = input.nextDouble();
            sum += heights[i]; // sum of the heights
        }
        
        double mean = sum / 11;
        System.out.printf("Mean height of the football team: %.2f" , mean);
        
        input.close();
    }
}
