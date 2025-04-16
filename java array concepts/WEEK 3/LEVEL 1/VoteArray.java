import java.util.Scanner;
class VoteArray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++){
			System.out.print("enter student "+(i+1)+" age :");
			arr[i]=input.nextInt();
		}
		System.out.print("\n");
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0)System.err.println("invalid age");
			else if(arr[i]>=18)System.out.println("student "+(i+1)+ " is eligible to vote ");
			else System.out.println("student "+(i+1)+ " is not eligible to vote ");
		}
	}
}