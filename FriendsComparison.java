import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt(); // input for age
            
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = input.nextDouble(); // input for height
        }
        
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // store the index of youngest age
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // store the index for tallest height
            }
        }
        
        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (" + ages[youngestIndex] + " years)");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (" + heights[tallestIndex] + " cm)");
    }
}
