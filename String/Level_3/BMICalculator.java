import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] result = prepareResult(hw);
        display(result);
    }

    static String[][] computeBMI(double[][] hw) {
        String[][] res = new String[hw.length][2];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightM = hw[i][1] / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
            res[i][0] = String.format("%.2f", bmi);
            res[i][1] = status;
        }
        return res;
    }

    static String[][] prepareResult(double[][] hw) {
        String[][] bmiData = computeBMI(hw);
        String[][] finalRes = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            finalRes[i][0] = String.format("%.2f", hw[i][0]);
            finalRes[i][1] = String.format("%.2f", hw[i][1]);
            finalRes[i][2] = bmiData[i][0];
            finalRes[i][3] = bmiData[i][1];
        }
        return finalRes;
    }

    static void display(String[][] data) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    data[i][0], data[i][1], data[i][2], data[i][3]);
        }
        System.out.println("------------------------------------------------------------");
    }
}
