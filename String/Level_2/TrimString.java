import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        int[] points = findTrimPoints(text);
        String customTrimmed = makeSubstring(text, points[0], points[1]);
        String builtinTrimmed = text.trim();

        boolean isSame = compareStrings(customTrimmed, builtinTrimmed);

        System.out.println("Custom Trimmed: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtinTrimmed + "\"");
        System.out.println("Are both same? " + isSame);
    }

    static int[] findTrimPoints(String s) {
        int length = 0;
        try {
            for (;; length++) {
                s.charAt(length);
            }
        } catch (Exception e) {
        }

        int start = 0;
        while (start < length && s.charAt(start) == ' ') {
            start++;
        }

        int end = length - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String makeSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            for (;; len1++) {
                s1.charAt(len1);
            }
        } catch (Exception e) {
        }
        try {
            for (;; len2++) {
                s2.charAt(len2);
            }
        } catch (Exception e) {
        }

        if (len1 != len2) return false;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
