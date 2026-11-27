import java.util.Scanner;
public class MergeArrays {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int arr1[] = new int[n];
         

        for(int i=0; i<n; i++){
            arr1[i]= sc.nextInt();
        }

        System.out.println("enter the size of array");
        int m = sc.nextInt();

        System.out.println("enter the element of array");
        int arr2[] = new int[m];
         

        for(int i=0; i<m; i++){
            arr2[i]= sc.nextInt();
        }
          int merged[] = new int[n+m];

          for(int i=0; i<n; i++){
            merged[i] = arr1[i];
          }

          for(int i=0; i<m; i++){
            merged[n+i] = arr2[i];
          }

          System.out.println("merged array:");
          for(int i=0; i<merged.length; i++){
            System.out.print(merged[i] + " ");
          }
    }
}