import java.util.Scanner;
class frequency{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number=scanner.nextLong();

        int[] frequency=new int[10];

        long temp=number;
        while(temp>0){
            int digit=(int)(temp%10); 
            frequency[digit]++; 
            temp/=10; 
        }
        System.out.println("\nDigit Frequency in "+number+":");
        for (int i=0;i<10;i++){
            if(frequency[i]>0){ 
                System.out.println("Digit "+i+" appears "+frequency[i]+" times.");
            }
        }
    }
}
