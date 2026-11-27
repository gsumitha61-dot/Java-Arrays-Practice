import java.util.Scanner;

public class Intersection{

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size");
      int n = sc.nextInt();
      System.out.println("enter the array element");
      int[] arr1 = new int[n];

      for (int i = 0; i < n; i++) {
         arr1[i] = sc.nextInt();
      }


      System.out.println("Enter the array size");
      int m = sc.nextInt();
      System.out.println("enter the array element");
      int[] arr2 = new int[m];

      for (int i = 0; i < m; i++) {
         arr2[i] = sc.nextInt();
      }



      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                break;
            }
        }
      }

      }
}

   
