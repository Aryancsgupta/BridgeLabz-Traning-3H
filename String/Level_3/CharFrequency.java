import java.util.Scanner;

public class CharFrequency {
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

    static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        String[][] result = new String[getLength(str)][2];
        int index = 0;
        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static int getLength(String[][] arr) {
        int count = 0;
        try {
            while (true) {
                String[] temp = arr[count];
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
}
