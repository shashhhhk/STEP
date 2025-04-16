import java.util.Scanner;
class OddOREven{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt();
		if(num>0){
			for(int i=1;i<=num;i++){
				if(i==1)System.out.print("1-odd\n");
				else if(i%2==0)System.out.println(i+"-even");
				else System.out.println(i+"-odd");
			}
		}
	}
}