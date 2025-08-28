import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = 1;

        while (true) {
            System.out.println("\n--- Student " + studentCount + " ---");

            do {
                System.out.print("Enter number of books borrowed: ");
                int numBooks = sc.nextInt();
                int totalFine = 0;

                for (int i = 1; i <= numBooks; i++) {
                    System.out.println("\nBook " + i + " category: ");
                    System.out.println("1. Regular\n2. Reference\n3. Magazine");
                    int category = sc.nextInt();

                    String bookType = "";
                    switch (category) {
                        case 1: bookType = "Regular"; break;
                        case 2: bookType = "Reference"; break;
                        case 3: bookType = "Magazine"; break;
                        default: bookType = "Invalid"; break;
                    }

                    if (bookType.equals("Invalid")) {
                        System.out.println("Invalid category. Skipping this book.");
                        continue;
                    }

                    System.out.print("Enter days late for " + bookType + " book: ");
                    int daysLate = sc.nextInt();
                    int fine = 0;

                    if (daysLate >= 1 && daysLate <= 6) {
                        fine = daysLate * 10;
                    } else if (daysLate >= 7 && daysLate <= 10) {
                        fine = daysLate * 20;
                    } else if (daysLate > 10) {
                        fine = daysLate * 50;
                    }

                    System.out.println("Fine for " + bookType + " book (days late " + daysLate + "): ₹" + fine);
                    totalFine += fine;
                }

                System.out.println("\nTotal fine for Student " + studentCount + " = ₹" + totalFine);
                System.out.print("\nDo you want to calculate fine for more books for the same student? (yes/no): ");
                String moreBooks = sc.next();
                if (!moreBooks.equalsIgnoreCase("yes")) {
                    break;
                }
            } while (true);

            System.out.print("\nDo you want to enter another student? (yes/no): ");
            String moreStudents = sc.next();
            if (!moreStudents.equalsIgnoreCase("yes")) {
                break;
            }
            studentCount++;
        }

        System.out.println("\nFine calculation program ended.");
        sc.close();
    }
}