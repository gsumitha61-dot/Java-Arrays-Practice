import java.util.Scanner;

public class UnionArrays{

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



      for(int i=0; i<m; i++){
        boolean found =false;
        for(int j=0; j<n; j++){
            if(arr1[j]==arr2[i]){
                found = true;
                break;
            }
        }
        for (int k = 0; k < i; k++) {
    if (arr2[k] == arr2[i]) {
        found = true;
        break;
    }
}
      
      if(!found){
        System.out.println(arr2[i]);

      }
    }
    }
}
