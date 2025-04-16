import java.util.Scanner;
public class ShortALong {
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
    public static String[] splitText(String text) {
        int length = getLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') spaceCount++;
        int[] indexes = new int[spaceCount + 2];
        indexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') indexes[idx++] = i;
        indexes[idx] = length;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++)word += text.charAt(j);
            words[i] = word;
        }
        return words;
    }
    public static String[][] getWordLengths(String[] words) {
        int n = getLengthArray(words);
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            int wordLength = getLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(wordLength);
        }
        return result;
    }
    public static int[] findMinMaxLength(String[][] wordData) {
        int n = getLengthArray(wordData);
        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(wordData[0][1]);
        int maxLength = Integer.parseInt(wordData[0][1]);
        for (int i = 1; i < n; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < minLength) {
                minLength = len;
                minIndex = i;
            }
            if (len > maxLength) {
                maxLength = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = splitText(input);
        String[][] wordData = getWordLengths(words);
        int[] result = findMinMaxLength(wordData);
        System.out.println("Shortest Word: " + wordData[result[0]][0] + " (Length: " + wordData[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordData[result[1]][0] + " (Length: " + wordData[result[1]][1] + ")");
    }
}
