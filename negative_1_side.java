public class negative_1_side {
    public static void main(String args[]){
        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
            }
        }
    }
    System.out.println("The sorted array is:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}