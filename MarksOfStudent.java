import java.util.Scanner;

public class MarksOfStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[][] marks = new int[numStudents][3];
        float[] percentages = new float[numStudents];
        String[] grades = new String[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter " + subject + " marks for student " + (i + 1) + ": ");
                marks[i][j] = input.nextInt();
                
                while (marks[i][j] < 0) {
                    System.out.print("Invalid input. Enter positive " + subject + " marks for student " + (i + 1) + ": ");
                    marks[i][j] = input.nextInt();
                }
            }
            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0f;
            
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
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        
        input.close();
    }
}
