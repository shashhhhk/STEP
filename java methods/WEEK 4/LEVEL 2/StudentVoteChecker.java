import java.util.Scanner;
class StudentVoteChecker{
	public static boolean CanStudentVote(int age){
		if(age<18)return false;
		else return true;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] age=new int[10];
		for(int i=0;i<10;i++){
			System.out.print("Student "+(i+1)+"'s age :");
			age[i]=input.nextInt();
		}
		for(int i =0;i<10;i++){
			if(CanStudentVote(age[i]))System.out.println("Student "+(i+1)+" is eligible to vote ");
			else System.out.println("Student "+(i+1)+" is not eligible to vote ");
		}
	}
}