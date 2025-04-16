import java.util.Scanner;

public class LargestDigit{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=input.nextInt(); 
        int maxDigit=10;
        int[] digits=new int[maxDigit]; 
        int index=0; 
        
        while(number!=0&&index<maxDigit){
            digits[index]=number%10;
            number/=10; 
            index++;
        }
        if(index==0){ 
            System.out.println("No digits to process.");
            return;
        }
        int largest=digits[0];
        int secondLargest=digits[0];

        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            } else if(digits[i]>secondLargest&&digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+secondLargest);
    }
}
