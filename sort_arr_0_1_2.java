import java.util.Scanner;
public class sort_arr_0_1_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count_0=0,count_1=0,count_2=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                count_0++;
            }
            else if(arr[j]==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }
        int index=0;
        for(int k=0;k<count_0;k++){
            arr[index++]=0;
        }
        for(int k=0;k<count_1;k++){
            arr[index++]=1;
        }
        for(int k=0;k<count_2;k++){
            arr[index++]=2;
        }

        System.out.println("Sorted array iS:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
