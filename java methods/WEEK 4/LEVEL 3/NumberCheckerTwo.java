import java.util.Scanner;
public class NumberCheckerTwo{
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
  public static int sumOfDigits(int[] digits){
    int sum=0;
    for(int digit:digits)sum+=digit;
    return sum;
  }
  public static double sumOfSquaresOfDigits(int[] digits){
    double sum=0;
    for(int digit:digits)sum += Math.pow(digit, 2);
    return sum;
  }
  public static boolean isHarshadNumber(int number,int[] digits){
    return number%sumOfDigits(digits)==0;
  }
  public static int[][] digitFrequency(int[] digits){
    int[][] frequency=new int[10][2];
    for(int digit:digits){
      frequency[digit][0]=digit;
      frequency[digit][1]++;
    }
    return frequency;
  }
  public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
    System.out.print("enter number :");
	int number=scanner.nextInt();
    int[] digits=storeDigits(number);
    System.out.println("Count of digits: "+countDigits(number));
    System.out.println("Sum of digits: "+sumOfDigits(digits));
    System.out.println("Sum of squares of digits: "+sumOfSquaresOfDigits(digits));
    System.out.println("Is Harshad number: "+isHarshadNumber(number,digits));
    int[][] frequency=digitFrequency(digits);
    System.out.println("Digit frequencies:");
    for(int i=0;i<frequency.length;i++){
      if(frequency[i][1]>0){
        System.out.println("Digit "+frequency[i][0]+": "+frequency[i][1]+" time(s)");
      }
    }
  }
}
