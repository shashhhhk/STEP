import java.util.Scanner;
public class NumberCheckerThree{
  public static int countDigits(int number){
    return Integer.toString(number).length();
  }
  public static int[] storeDigits(int number){
    int numDigits=countDigits(number);
    int[] digits=new int[numDigits];
    for(int i=numDigits-1;i>=0;i--){
      digits[i]=number%10;
      number/=10;
    }
    return digits;
  }
  public static int[] reverseDigits(int[] digits){
    int length=digits.length;
    int[] reversed=new int[length];
    for(int i=0;i<length;i++)reversed[i]=digits[length-1-i];
    return reversed;
  }
  public static boolean compareArrays(int[] array1,int[] array2){
    if(array1.length!=array2.length)return false;
    for(int i=0;i<array1.length;i++)if(array1[i]!=array2[i])return false;
    return true;
  }
  public static boolean isPalindrome(int number,int[] digits){
    int[] reversed=reverseDigits(digits);
    return compareArrays(digits, reversed);
  }
  public static boolean isDuckNumber(int number,int[] digits){
    for(int digit:digits)if(digit!=0)return true;
    return false;
  }
  public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
    System.out.print("enter number :");
	int number=scanner.nextInt();
    int[] digits=storeDigits(number);
    System.out.println("Count of digits: "+countDigits(number));
    int[] reversedDigits=reverseDigits(digits);
    System.out.println("Reversed digits:");
    for(int digit:reversedDigits)System.out.print(digit);
    System.out.println();
    System.out.println("Is Palindrome: "+isPalindrome(number, digits));
    System.out.println("Is Duck Number: "+isDuckNumber(number, digits));
  }
}
