public class Reverse{
    public static String reverseWords(String sentence){
        String[] words=sentence.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            StringBuilder reversedWord=new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String input="Java is fun";
        String output=reverseWords(input);
        System.out.println("Reversed words: "+output);
    }
}
