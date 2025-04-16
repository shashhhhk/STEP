import java.util.Scanner;
class MultiplicationSixToNine{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt();
		int[] multiplication=new int[4];
		int temp1=6;
		for(int i=0;i<4;i++){
			multiplication[i]=num*temp1;
			temp1++;
		}
		int temp2=6;
		for(int i=0;i<4;i++){
			System.out.println(num+"*"+temp2+"="+multiplication[i]);
			temp2++;
		}
	}
}
		