import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (1 or greater).");
            return;
        }
        
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) { // number is odd
                evenNumbers[evenIndex++] = i;
            } else { // number is even
                oddNumbers[oddIndex++] = i;
            }
        }
        
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " "); // print odd numbers
        }
        System.out.println();
        
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " "); //print even numbers
        }
        System.out.println();
    }
}