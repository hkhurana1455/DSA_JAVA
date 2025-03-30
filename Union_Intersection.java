public class Union_Intersection {
    static void Intersection(int a[],int b[]){
        int result[]=new int[100];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                   result[k]=a[i];
                   k++;
                }
            }
        }
        System.out.println("The intersection is:");
        for(int i=0;i<k;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
    static void Union(int a [],int b[]){
        int i = 0, j = 0;
        int n = a .length, m = b.length;
        System.out.println("The Union is:");
        while (i < n && j < m) {
            if (a [i] < b[j]) {
                System.out.print(a [i++] + " ");
            } else if (a [i] > b[j]) {
                System.out.print(b[j++] + " ");
            } else { 
                System.out.print(a [i] + " ");
                i++;
                j++;
            }
        }

        while (i < n) System.out.print(a [i++] + " ");
        while (j < m) System.out.print(b[j++] + " ");
    }
        
    public static void main(String[] args) {
        int[]a={1,2,5,7,8};
        int[]b={3,5,7,9,10};
        Intersection(a,b);
        Union(a,b);
        }
    }
