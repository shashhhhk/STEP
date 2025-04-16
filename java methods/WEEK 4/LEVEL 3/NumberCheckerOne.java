import java.util.Scanner;
public class NumberCheckerOne{
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
    public static boolean isDuckNumber(int number,int[] digits){
        for(int digit:digits){
            if(digit!=0)return true;
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number, int[] digits){
        int numDigits=digits.length;
        int sum=0;
        int originalNumber=number;
        for(int digit:digits)sum+=Math.pow(digit,numDigits);
        return sum==originalNumber;
    }
    public static int[] findLargestAndSecondLargest(int[] digits){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int digit:digits){
            if(digit>largest){
                secondLargest=largest;
                largest=digit;
            }else if(digit>secondLargest&&digit!=largest)secondLargest=digit;
        }
        return new int[]{largest,secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int digit:digits){
            if(digit<smallest){
                secondSmallest=smallest;
                smallest=digit;
            }else if(digit<secondSmallest&&digit!=smallest)secondSmallest=digit;
        }
        return new int[]{smallest,secondSmallest};
    }
    public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
        System.out.print("enter number :");
		int number=scanner.nextInt();
        int[] digits=storeDigits(number);
        System.out.println("Count of digits: "+countDigits(number));
        if(isDuckNumber(number,digits))System.out.println(number+" is a Duck number.");
        else System.out.println(number+" is not a Duck number.");
 
        if(isArmstrongNumber(number,digits))System.out.println(number+" is an Armstrong number.");
        else System.out.println(number + " is not an Armstrong number.");

        int[] largestAndSecondLargest=findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: "+largestAndSecondLargest[0]);
        System.out.println("Second largest digit: "+largestAndSecondLargest[1]);

        int[] smallestAndSecondSmallest=findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: "+smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: "+smallestAndSecondSmallest[1]);
    }
}
