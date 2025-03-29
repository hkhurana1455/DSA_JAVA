import java.util.Scanner;
public class kth_max_min {
    public static void main(String[] args){
        int arr[]={4,8,2,9,6,1};
        int n=arr.length;
        for(int j=0;j<n;j++){
            for(int i=j+1;i<n;i++){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
            }
        }
    }
        
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();

    System.out.println("The "+num+" max number is: "+arr[n-num]);

    System.out.println("The "+num+" min number is: "+arr[num-1]);

    }
}
