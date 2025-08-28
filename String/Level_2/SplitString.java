import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] customSplit = splitWords(text);
        String[] builtinSplit = text.split(" ");

        System.out.println("Custom Split Result:");
        for (String w : customSplit) {
            System.out.println(w);
        }

        System.out.println("Built-in Split Result:");
        for (String w : builtinSplit) {
            System.out.println(w);
        }

        boolean isSame = compareArrays(customSplit, builtinSplit);
        System.out.println("Are both results same? " + isSame);
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

    static String[] splitWords(String s) {
        int length = findLength(s);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 2];
        spaceIndexes[0] = -1;
        int index = 1;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            String word = "";
            for (int j = start; j < end; j++) {
                word += s.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }
        return true;
    }
}
