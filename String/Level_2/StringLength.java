import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int customLength = findLength(str);
        int builtinLength = str.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtinLength);
    }

    static int findLength(String s) {
        int count = 0;
        try {
            for (;; count++) {
                s.charAt(count);
            }
        } catch (Exception e) {
            return count;
        }
    }
}
