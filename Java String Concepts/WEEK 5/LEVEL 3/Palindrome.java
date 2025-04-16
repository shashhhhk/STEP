import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter a string :");
        String str=input.nextLine();
        if(palindrome(str))System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }
    public static boolean palindrome(String str){
        char[] arr1=new char[str.length()],arr2=new char[str.length()];
        for(int i=0;i<str.length();i++)arr1[i]=str.charAt(i);
        for(int i=str.length()-1;i>=0;i--)arr2[i]=str.charAt(i);
        for(int i=0;i<str.length();i++)if(arr1[i]!=arr2[i])return false;
        return true;
    }
}