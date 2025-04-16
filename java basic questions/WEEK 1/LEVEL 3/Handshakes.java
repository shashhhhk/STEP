import java.util.Scanner;
class Handshakes{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number of students :");
		int N=input.nextInt();
		
		int total=(N*(N-1))/2;
		System.out.println("the total number of hanshakes possible among "+N+" students is "+total);
	}
}