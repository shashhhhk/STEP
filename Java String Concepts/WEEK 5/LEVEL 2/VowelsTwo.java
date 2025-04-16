import java.util.Scanner;
public class VowelsTwo {
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
    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] getCharTypeTable(String text) {
        int len = getLength(text);
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharType(ch);
        }
        return result;
    }
    public static void displayCharTypeTable(String[][] table) {
        System.out.printf("%-10s%-15s\n", "Character", "Type");
        System.out.println("------------------------");
        for (int i = 0; i < table.length; i++)System.out.printf("%-10s%-15s\n", table[i][0], table[i][1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] table = getCharTypeTable(input);
        displayCharTypeTable(table);
    }
}
