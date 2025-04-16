import java.util.Scanner;
class YoungNTallArray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter Amar,Akbar and Anthony's age respectively :");
		int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
		System.out.print("enter Amar,Akbar and Anthony's heights respectively :");
		double d=input.nextDouble(),e=input.nextDouble(),f=input.nextDouble();
		
		int[] age={a,b,c};
		double[] height={d,e,f};
		
		int a_max=age[0];double h_max=height[0];
		
		for(int i=0;i<age.length;i++)if(age[i]>a_max)a_max=age[i];
		for(int i=0;i<height.length;i++)if(height[i]>h_max)h_max=height[i];
		
		if(a_max==age[0])System.out.println("Amar is the eldest");
		else if(a_max==age[1])System.out.println("Akbar is the eldest");
		else System.out.println("Anthony is the eldest");
		
		if(h_max==height[0])System.out.println("Amar is the tallest");
		else if(h_max==height[1])System.out.println("Akbar is the tallest");
		else System.out.println("Anthony is the tallest");
	}
}