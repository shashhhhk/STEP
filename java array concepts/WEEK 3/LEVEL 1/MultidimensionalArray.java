import java.util.Scanner;
class MultidimensionalArray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter rows and columns :");
		int row=input.nextInt(),col=input.nextInt();
		int[][] arr1=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("enter element ["+i+"]["+j+"] :");
				arr1[i][j]=input.nextInt();
			}
		}
		int[] arr2=new int[row*col];
		int index=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr2[index]=arr1[i][j];
				index++;
			}
		}
		for(int i=0;i<row*col;i++)System.out.println("element "+i+" :"+arr2[i]);
	}
}