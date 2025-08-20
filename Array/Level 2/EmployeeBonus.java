import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 10;
        double[] salary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for " + numEmployees + " employees:");

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            double s = sc.nextDouble();
            if (s <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--; 
                continue;
            }
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();
            if (y < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--;
                continue;
            }
            salary[i] = s;
            yearsOfService[i] = y;
        }

        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + 
                               " | Old Salary: " + salary[i] + 
                               " | Bonus: " + bonus[i] + 
                               " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Summary ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
