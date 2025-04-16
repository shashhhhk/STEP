import java.util.Scanner;
class FactorArray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt(),index=0;
		int[] factor=new int[20];
		for(int i=1;i<num;i++){
			if(num%i==0){
				factor[index]=i;
				index++;
			}
		}
		System.out.print("\nthe factors are ");
		for(int i=0;i<factor.length;i++){
			if(factor[i]==0)continue;
			System.out.println(factor[i]);
		}
	}
}
			