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
public class LinearS{
     public static void main(String[] args){
        String name="Himani";
        char target='m';
        System.out.println(search(name, target));

     }
     static boolean search(String str, char ch){
        if(str.length()==0){
            return false;
        }
        for( char i : str.toCharArray()){
            if(ch == i){
                return true;
            }
        }
        return false;
     }
}
