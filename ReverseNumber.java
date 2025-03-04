import java.util.Scanner;

public class ReverseNumber {
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
                for(int a = 0; a < index; a++){
                    temp[a] = digits[a];
                }
                digits = temp;
            }
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }
        
        if (index == 0) {
            System.out.println("No digits found in the number.");
            return;
        }
        
        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
