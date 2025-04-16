import java.util.Scanner;
class ArrayCheck{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++){
			System.out.print("enter element "+(i+1)+" :");
			arr[i]=input.nextInt();
		}
		System.out.print("\n");
		for(int i=0;i<5;i++){
			if(arr[i]>0){
				if(arr[i]%2==0)System.out.println("element "+(i+1)+" is positive and even ");
				else System.out.println("element "+(i+1)+" is positive and odd");
			}
			else if(arr[i]<0)System.out.println("element "+(i+1)+" is negative ");
			else System.out.println("element "+(i+1)+" is 0 ");
		}
		System.out.print("\n");
		if(arr[0]<arr[4])System.out.print(arr[4]+" is greater than "+arr[0]);
		else if(arr[0]>arr[4])System.out.print(arr[4]+" is lesser than "+arr[0]);
		else System.out.print(arr[4]+" is equal to "+arr[0]);
	}
}