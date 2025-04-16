import java.util.Scanner;
class fizzbuzzArray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt();
		String[] arr=new String[num+1];
		if(num>=0){
			for(int i=1;i<=num;i++){
				if(i%3==0&&i%5==0){
					arr[i]="fizzbuzz";
				continue;}
				else if(i%3==0){
					arr[i]="fizz";
				continue;}
				else if(i%5==0){
					arr[i]="buzz";
				continue;}
				arr[i]=""+i;
			}
			for(int i=0;i<=num;i++)System.out.println(i+"-"+arr[i]);
		}
		else System.err.print("invalid number ");
	}
}
		