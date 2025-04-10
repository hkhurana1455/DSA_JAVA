// earching in an array

// public class LinearS {
//     static boolean search(int arr[], int target){
//         if(arr.length==0){
//             return false;
//         }
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int []arr={1,3,6,2};
//         int target=2;
//         System.out.println(search(arr, target));
//     }
// }

// Searching in String

// public class LinearS{
//      public static void main(String[] args){
//         String name="Himani";
//         char target='m';
//         System.out.println(search(name, target));

//      }
//      static boolean search(String str, char ch){
//         if(str.length()==0){
//             return false;
//         }
//         for( char i : str.toCharArray()){
//             if(ch == i){
//                 return true;
//             }
//         }
//         return false;
//      }
// }

// searching in a 2D array

// import java.util.Arrays;

// public class LinearS{
//     static int[] search(int [][]arr, int target){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j]==target){
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[] {-1,-1};
//     }
//     public static void main(String[] args) {
//         int [][] arr={{1,45,7},{2,3,9,8},{6,5}};
//         int target=9;
//         int []ans=search(arr,target);
//         System.out.println(Arrays.toString(ans));
//     }
// }

// Searching the number of even numbers in an array

public class LinearS {
    static int findNum(int [] nums){
        int count=0;
        for(int i:nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int i){
        int digits=NumDigits(i);
        if(digits%2==0){
            return true;
        }
        return false;
    }
    static int NumDigits(int i){
        //or simply  if(i<0){i=i*-1;}return (int)(Math.log10(i))+1;
        int n=0;
        while(i>0){
            n++;
            i=i/10;
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr={2134,32,6,823,9,12};
        int ans=findNum(arr);
        System.out.println(ans);
    }
}


