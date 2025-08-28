import java.util.Scanner;

public class WordLengthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordWithLengths = getWordLengthArray(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordWithLengths.length; i++) {
            String word = wordWithLengths[i][0];
            int len = Integer.parseInt(wordWithLengths[i][1]); // convert back to integer
            System.out.println(word + "\t" + len);
        }
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

    static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
}
