import java.util.Scanner;

public class VotingAge{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int size = 10; // size of the array
		int[] StudentAge = new int[size];
		
		for(int i=0;i<StudentAge.length;i++){
			StudentAge[i] = input.nextInt(); // input for the Student age and storing in the array
		}
		
		for(int i=0;i<StudentAge.length;i++){
			System.out.print("Student with age " + StudentAge[i]);
			if(StudentAge[i] >= 18){ // check if the age of student is greater than equal to 18 so he/she can vote
				System.out.println(" can vote");
			}
			else{ // age is less than 18 so he/she can not vote
				System.out.println(" can not vote");
			}
		}
		input.close();
	}
}