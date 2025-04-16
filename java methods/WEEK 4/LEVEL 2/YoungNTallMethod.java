import java.util.Scanner;
class YoungNTallMethod{
	public static void Youngest(int[] age){
		int a_min=age[0];
		for(int i=0;i<age.length;i++)if(age[i]<a_min)a_min=age[i];
		if(a_min==age[0])System.out.println("Amar is the youngest");
		else if(a_min==age[1])System.out.println("Akbar is the youngest");
		else System.out.println("Anthony is the youngest");
	}
	public static void Tallest(double[] height){
		double h_max=height[0];
		for(int i=0;i<height.length;i++)if(height[i]>h_max)h_max=height[i];
		if(h_max==height[0])System.out.println("Amar is the tallest");
		else if(h_max==height[1])System.out.println("Akbar is the tallest");
		else System.out.println("Anthony is the tallest");
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter Amar,Akbar and Anthony's age respectively :");
		int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
		System.out.print("enter Amar,Akbar and Anthony's heights respectively :");
		double d=input.nextDouble(),e=input.nextDouble(),f=input.nextDouble();
		
		int[] age={a,b,c};
		double[] height={d,e,f};
		
		Youngest(age);
		Tallest(height);
	}
}