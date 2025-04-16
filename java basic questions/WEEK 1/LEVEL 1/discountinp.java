import java.util.Scanner;
class discountinp{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("fee= ");
		double fee=input.nextDouble();
		System.out.print("discount =");
		double discount=input.nextDouble();
		double discamt=(discount/100)*fee;
		double final_fee=fee-discamt;
		
		System.out.println("The discount amount is INR "+discamt+" and the final discounted fee is "+final_fee);
	}
}