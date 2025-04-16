import java.util.Scanner;
public class SplitTwo{
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] splitText(String text) {
        int length = getLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') spaceCount++;
        int[] indexes = new int[spaceCount + 2];
        indexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < length; i++)if (text.charAt(i) == ' ')indexes[idx++] = i;
        indexes[idx] = length;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++)word += text.charAt(j);
            words[i] = word;
        }
        return words;
    }
    public static String[][] wordLengths(String[] words) {
        int n = getLengthArray(words);
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            int wordLength = getLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(wordLength);
        }
        return result;
    }
    public static int getLengthArray(String[] array) {
        int count = 0;
        try {
            while (true) {
                String temp = array[count];
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static int getLengthArray(String[][] array) {
        int count = 0;
        try {
            while (true) {
                String[] temp = array[count];
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = splitText(input);
        String[][] wordData = wordLengths(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < getLengthArray(wordData); i++) {
            int len = Integer.parseInt(wordData[i][1]);
            System.out.println(wordData[i][0] + "\t" + len);
        }
    }
}
