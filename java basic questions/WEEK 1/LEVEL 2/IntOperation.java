import java.util.Scanner;
class IntOperation{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter a,b and c :");
		int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
		
		int r1=a+b*c,r2=a*b+c,r3=c+a/b,r4=a%b+c;
		
		System.out.println(+r1+"\n"+r2+"\n"+r3+"\n"+r4);
	}
}