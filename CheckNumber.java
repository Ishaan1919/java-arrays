import java.util.Scanner;

public class CheckNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int size = 5; // size of the array
		int[] numbers = new int[size];
		
		System.out.print("Enter 5 numbers: ");
		for(int i=0;i<numbers.length;i++){
			numbers[i] = input.nextInt(); // Input the numbers and are stored in the array
		}
		for(int i=0;i<size;i++){
			int number = numbers[i]; // storing the value of a number in a variable
			System.out.print("The number is ");
			if(number < 0){ // number is less than 0
				System.out.println("negative");
			}
			else if(number > 0){ // number is greater than 0
				System.out.print("positive");
				if(number%2==0){
					System.out.println(" and it is an even number");
				}
				else{
					System.out.println(" and it is an odd number");
				}
			}
			else{ // the number is zero
				System.out.println("zero");
			}
		}
		int firstNumber = numbers[0];
		int lastNumber = numbers[size-1];
		if(firstNumber < lastNumber){
			System.out.print("First number is less than the last number");
		}
		else if(firstNumber > lastNumber){
			System.out.print("First number is greater than the last number");
		}
		else{
			System.out.print("First number is equal to the last number");
		}
		input.close();
	}
}