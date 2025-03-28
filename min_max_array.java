public class min_max_array{
    public static void main(String args[]){
        int []arr={1,7,9,10,14,2};
        int max=arr[0];
        int min=arr[0];
        int max_index=0;
        int min_index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                max_index=i;
            }
            if(arr[i]<min){
                min=arr[i];
                min_index=i;
            }
        }
        System.out.println("Maximum number is:"+max+" at index:"+max_index);
        System.out.println("Minimum number is:"+min+" at index:"+min_index);
    }
}