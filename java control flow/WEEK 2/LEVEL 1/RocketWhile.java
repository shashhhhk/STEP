import java.util.Scanner;
class RocketWhile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter start value of countdown :");
		int count=input.nextInt();
		while(count!=0){
			System.out.println(count);
			count--;
		}
	}
}