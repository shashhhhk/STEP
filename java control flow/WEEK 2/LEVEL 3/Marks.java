import java.util.Scanner;
class Marks{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter physics,chemistry and math marks respectively :");
		int p_mark=input.nextInt(),c_mark=input.nextInt(),m_mark=input.nextInt();
		double percent=(m_mark+p_mark+c_mark)/3;
		if(percent>=80)System.out.println("A GRADE");
		else if(percent>=70&&percent<80)System.out.println("B GRADE");
		else if(percent>=60&&percent<70)System.out.println("C GRADE");
		else if(percent>=50&&percent<60)System.out.println("D GRADE");
		else if(percent>=40&&percent<50)System.out.println("E GRADE");
		else System.out.println("R GRADE");
	}
}