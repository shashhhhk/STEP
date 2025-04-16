import java.util.Scanner;
public class Vowels{
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
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z')ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        int len = getLength(text);
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            if (type.equals("Vowel"))vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
