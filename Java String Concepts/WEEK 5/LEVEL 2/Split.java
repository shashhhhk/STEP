import java.util.Scanner;
public class Split {
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
        for (int i = 0; i < length; i++)if (text.charAt(i) == ' ') spaceCount++;
        int[] indexes = new int[spaceCount + 2];
        indexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') indexes[idx++] = i;
        indexes[idx] = length;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) word += text.charAt(j);
            words[i] = word;
        }
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] userDefinedSplit = splitText(input);
        String[] builtInSplit = input.split(" ");
        boolean result = compareArrays(userDefinedSplit, builtInSplit);
        System.out.println("Words from user-defined method:");
        for (String word : userDefinedSplit) System.out.println(word);
        System.out.println("Comparison with built-in split(): " + result);
    }
}
