import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); // Taking user input
        
        if (number < 1) {
            System.out.println("Error: Please enter a positive integer.");
            return; // return the program
        }
        
        String[] results = new String[number + 1];
        
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // 5 and 3 are the factors of i
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) { // only 3 is a factor of i
                results[i] = "Fizz";
            } else if (i % 5 == 0) { // only 5 is a factor of i
                results[i] = "Buzz";
            } else { // none is a factor of i
                results[i] = i+""; // converting int to string can also use String.valueOf(i)
            }
        }
        
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
