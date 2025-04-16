import java.util.Scanner;
public class FrequencyUnique {
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = ch;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }
    public static String[][] frequencyUsingUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencies = frequencyUsingUnique(input);
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++)System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
    }
}
