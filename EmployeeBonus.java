import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();
            
            while (salaries[i] <= 0) {
                System.out.print("Invalid input. Enter a positive salary for employee " + (i + 1) + ": ");
                salaries[i] = input.nextDouble();
            }
            
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();
            
            while (yearsOfService[i] < 0) {
                System.out.print("Invalid input. Enter a valid number of years for employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();
            }
        }
        
        for (int i = 0; i < numEmployees; i++) {
            bonuses[i] = (yearsOfService[i] > 5) ? (salaries[i] * 0.05) : (salaries[i] * 0.02);
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("\nEmployee Salary Details:");
        System.out.println("Employee  Old Salary  Years of Service  Bonus  New Salary");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%d         %.2f      %.1f                %.2f   %.2f\n", 
                (i + 1), salaries[i], yearsOfService[i], bonuses[i], newSalaries[i]);
        }
        
        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        
        input.close();
    }
}
