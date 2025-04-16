import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt(),count=0,temp=num;
		while(temp!=0){
			count++;
			temp/=10;
		}
		int[] arr=new int[count];
		int temp1=num,index=0;
		while(temp1!=0){
			int remain=temp1%10;
			arr[index]=remain;
			temp1/=10;
			index++;
		}
		System.out.print("the reverse of the number is :");
		for(int i=0;i<count;i++)System.out.print(arr[i]);
	}
}