import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        System.out.println("\nHeight (m)  Weight (kg)  BMI  Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f       %.2f       %.2f  %s\n", heights[i], weights[i], bmi[i], status[i]);
        }
    }
}
