import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        int[] frequency = new int[10]; // Array to store frequency of each digit (0-9)
        
        while (number != 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }
        
        System.out.println("Digit Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}
