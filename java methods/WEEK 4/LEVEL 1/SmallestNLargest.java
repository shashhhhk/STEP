import java.util.Scanner;
class SmallestNLargest{
	public static int[] findSmallestAndLargest(int n1,int n2,int n3){
		int[] arr=new int[2];
		if(n1>n2&&n1>n3)arr[0]=n1;
		else if(n2>n3)arr[0]=n2;
		else arr[0]=n3;
			
		if(n1<n2&&n1<n3)arr[1]=n1;
		else if(n2<n3)arr[1]=n2;
		else arr[2]=n3;
		return arr;
	}
    public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter three numbers :");
		int n1=input.nextInt(),n2=input.nextInt(),n3=input.nextInt();
		int[] arr=findSmallestAndLargest(n1,n2,n3);
		System.out.println("Smallest number :"+arr[1]+"\nLargest number :"+arr[0]);
	}
}
		
			