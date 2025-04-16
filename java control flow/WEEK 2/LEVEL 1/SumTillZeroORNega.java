import java.util.Scanner;
class SumTillZeroORNega{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=0.0;
		while(true){
			System.out.print("enter a number other than 0 to add or input 0 or negative number to end :");
			int num=input.nextInt();
			if(num<=0)break;
			sum+=num;
		}
		System.out.println("sum="+sum);
	}
}