import java.util.Scanner;

public class NumberStorage{
    public static void main(String[] args){
		
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        
        while (true){ // Infinite loop to take input
            System.out.print("Enter a number (0 or negative to stop): ");
            double inputNumber = input.nextDouble();

            if (inputNumber <= 0){ // If the number is less than equal to zero
                break;
            }
			
            numbers[index] = inputNumber;
            index++;
            if (index == 10){
                break;
            }
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++){ // Calculate the sum of the array
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        
        // Display total sum
        System.out.println("\nTotal sum: " + total);
        input.close();
    }
}
