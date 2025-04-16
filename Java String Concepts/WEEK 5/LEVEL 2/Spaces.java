import java.util.Scanner;
public class Spaces{
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
    public static int[] getTrimIndexes(String text) {
        int start = 0;
        int end = getLength(text) - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ')end--;
        return new int[]{start, end + 1};
    }
    public static String getSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++)result += text.charAt(i);
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        int lenA = getLength(a);
        int lenB = getLength(b);
        if (lenA != lenB) return false;
        for (int i = 0; i < lenA; i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String text = sc.nextLine();
        int[] indexes = getTrimIndexes(text);
        String trimmedText = getSubstring(text, indexes[0], indexes[1]);
        String javaTrimmed = text.trim();
        System.out.println("Trimmed Text (custom): '" + trimmedText + "'");
        System.out.println("Trimmed Text (Java):   '" + javaTrimmed + "'");
        System.out.println("Are both equal? " + compareStrings(trimmedText, javaTrimmed));
    }
}
