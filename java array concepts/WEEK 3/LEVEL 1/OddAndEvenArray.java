import java.util.Scanner;
class OddAndEvenArray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt();
		if(num<=0){
			System.err.print("invalid input");
			System.exit(0);
		}
		int size=(num/2)+1;
		int[] odd=new int[size];
		int[] even=new int[size-1];
		int indexodd=0,indexeven=0;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				even[indexeven]=i;
				indexeven++;
			}
			else{
				odd[indexodd]=i;
				indexodd++;
			}
		}
		System.out.print("\nOdd array elements :");
		for(int i=0;i<size;i++)System.out.println(odd[i]+" ");
		System.out.print("\neven array elements :");
		for(int i=0;i<size-1;i++)System.out.println(even[i]+" ");
	}
}
			