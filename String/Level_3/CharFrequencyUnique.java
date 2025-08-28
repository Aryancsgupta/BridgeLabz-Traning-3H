import java.util.Scanner;

public class CharFrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] result = findFrequency(text);
        System.out.println("Character  Frequency");
        for (int i = 0; i < getLength(result); i++) {
            System.out.println(result[i][0] + "          " + result[i][1]);
        }
    }

    static String[] uniqueCharacters(String str) {
        char[] unique = new char[getLength(str)];
        int index = 0;
        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (unique[j] == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[index] = ch;
                index++;
            }
        }
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = String.valueOf(unique[i]);
        }
        return result;
    }

    static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        String[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[getLength(uniqueChars)][2];
        for (int i = 0; i < getLength(uniqueChars); i++) {
            char ch = uniqueChars[i].charAt(0);
            result[i][0] = uniqueChars[i];
            result[i][1] = String.valueOf(freq[ch]);
        }
        return result;
    }

    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static int getLength(String[] arr) {
        int count = 0;
        try {
            while (true) {
                String temp = arr[count];
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static int getLength(String[][] arr) {
        int count = 0;
        try {
            while (true) {
                String[] temp = arr[count];
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
}
