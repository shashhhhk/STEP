import java.util.Scanner;
class RocketFor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter start value of countdown :");
		int count=input.nextInt();
		for(int i=count;i>=1;i--){
			System.out.println(i);
		}
	}
}