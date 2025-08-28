import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] basic = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter basic salary of " + names[i] + ": ");
            basic[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            double hra = basic[i] * 0.20;
            double da = basic[i] * 0.10;
            double net = basic[i] + hra + da;

            if (net > 50000) {
                net = net - (net * 0.10);
            }

            System.out.println("------ Salary Slip ------");
            System.out.println("Name: " + names[i]);
            System.out.println("Basic Salary: " + basic[i]);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Net Salary: " + net);
            System.out.println("--------------------------");
        }

        sc.close();
    }
}
 