public class Cyclic_rotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
