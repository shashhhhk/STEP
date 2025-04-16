import java.util.Scanner;
class ArrayUpToTen{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] arr=new double[10];
		double total=0.0;
		int index=0;
		while(true){
			System.out.print("enter number :");
			int num=input.nextInt();
			if(num<=0||index==10)break;
			arr[index]=num;
			index++;
		}
		for(int i=0;i<arr.length;i++)total+=arr[i];
		System.out.println("the total sum ="+total);
	}
}
			
			