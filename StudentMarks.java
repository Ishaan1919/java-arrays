import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        float[] percentages = new float[numStudents];
        String[] grades = new String[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
            physicsMarks[i] = input.nextInt();
            while (physicsMarks[i] < 0) {
                System.out.print("Invalid input. Enter positive Physics marks for student " + (i + 1) + ": ");
                physicsMarks[i] = input.nextInt();
            }
            
            System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
            chemistryMarks[i] = input.nextInt();
            while (chemistryMarks[i] < 0) {
                System.out.print("Invalid input. Enter positive Chemistry marks for student " + (i + 1) + ": ");
                chemistryMarks[i] = input.nextInt();
            }
            
            System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
            mathsMarks[i] = input.nextInt();
            while (mathsMarks[i] < 0) {
                System.out.print("Invalid input. Enter positive Maths marks for student " + (i + 1) + ": ");
                mathsMarks[i] = input.nextInt();
            }
            
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0f;
            
            if (percentages[i] >= 80) {
                grades[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "Level 2, below, but approaching agency-normalized standard";
            } else if (percentages[i] >= 50) {
                grades[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "Remedial standard";
            }
        }
        
        System.out.println("\nStudent Marks, Percentages, and Grades");
        System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d        %d        %d        %d        %.2f%%     %s\n", 
                (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
        
        input.close();
    }
}
