import java.util.Scanner;
class HeightFootballer{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] height=new double[11];
		for(int i=0;i<11;i++){
			System.out.print("enter player "+(i+1)+" height (in cm) :");
			height[i]=input.nextDouble();
		}
		System.out.print("\n");
		double sum=0.0;
		for(int i=0;i<11;i++)sum+=height[i];
		double avg=sum/11;
		System.out.println("average ="+avg);
	}
}