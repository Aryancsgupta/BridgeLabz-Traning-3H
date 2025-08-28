import java.util.Scanner;

public class FrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] result = findFrequency(text);
        System.out.println("Character  Frequency");
        for (int i = 0; i < getLength(result); i++) {
            System.out.println(result[i]);
        }
    }

    static String[] findFrequency(String str) {
        char[] chars = str.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + "          " + freq[i];
                index++;
            }
        }
        return result;
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
}
