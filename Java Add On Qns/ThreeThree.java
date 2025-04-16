class ThreeThree{
    public static boolean three(int[] arr){
        for(int i=0;i<arr.length-1;i++)if(arr[i]==3&&arr[i+1]==3)return true;
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,3,3,1};
        if(three(arr))System.out.print("true");
        else System.out.print("false");
    }
}