import java.util.Scanner;
class YoungNTall{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter amar's,akbar's and anthony's ages respectively :");
		int amar_age=input.nextInt(),akbar_age=input.nextInt(),anthony_age=input.nextInt();
		System.out.print("enter amar's,akbar's and anthony's heights respectively :");
		double amar_height=input.nextDouble(),akbar_height=input.nextDouble(),anthony_height=input.nextDouble();
		if(amar_age>akbar_age&&amar_age>anthony_age)System.out.println("Amar is the eldest\n");
		else if(akbar_age>anthony_age)System.out.print("Akbar is the eldest\n");
		else System.out.print("Anthony is the eldest\n");
		
		if(amar_height>akbar_height&&amar_height>anthony_height)System.out.println("Amar is the tallest");
		else if(akbar_height>anthony_height)System.out.print("Akbar is the tallest");
		else System.out.print("Anthony is the tallest");
	}
}