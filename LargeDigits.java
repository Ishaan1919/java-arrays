import java.util.Scanner;

public class LargeDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for(int a=0;a<index;a++){
                  temp[a] = digits[a];
                }
                digits = temp;
            }
            digits[index] = (int)number % 10;
            number /= 10;
            index++;
        }
        
        if (index == 0) {
            System.out.println("No digits found in the number.");
            return;
        }
        
        int largest = digits[0];
        int secondLargest = -1;
        
        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "None" : secondLargest));
    }
}
