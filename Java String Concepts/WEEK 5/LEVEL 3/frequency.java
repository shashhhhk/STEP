import java.util.Scanner;
public class frequency {
    public static int[][] findFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        boolean[] visited = new boolean[256];
        int[][] result = new int[text.length()][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                result[index][0] = ch;
                result[index][1] = freq[ch];
                visited[ch] = true;
                index++;
            }
        }
        int[][] finalResult = new int[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[][] frequencies = findFrequencies(input);
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++)System.out.println((char)frequencies[i][0] + " -> " + frequencies[i][1]);
    }
}
