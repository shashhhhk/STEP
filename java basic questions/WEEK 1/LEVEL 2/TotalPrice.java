import java.util.Scanner;
class TotalPrice{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter price of the item :");
		double price=input.nextDouble();
		
		System.out.print("enter quantity of the item :");
		int quantity=input.nextInt();
		
		double total_price=price*quantity;
		
		System.out.println("the total purchase price is INR "+total_price+" if the quantity is "+quantity+" and unit price is INR "+price);
	}
}