public class frequency{
    public static void findFrequency(int[] arr){
        boolean[] visited=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i])
                continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"->"+count);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,3,4};
        findFrequency(arr);
    }
}
