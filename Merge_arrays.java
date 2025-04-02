
import java.util.Arrays;

public class Merge_arrays {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};
        int m=arr1.length;
        int n=arr2.length;

        int left=m-1;
        int right=0;
        while(left>=0 && right<n){
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));  
        System.out.println(Arrays.toString(arr2));       

    }
}
