import java.util.Scanner;
class RightNumber{
    public static void structure(int rows){
        for(int i=0;i<rows;i++){
            int k=1;
            for(int j=0;j<i+1;j++){
                System.out.print(k+"");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter number of rows :");
        int row=input.nextInt();
        structure(row);
    }
}