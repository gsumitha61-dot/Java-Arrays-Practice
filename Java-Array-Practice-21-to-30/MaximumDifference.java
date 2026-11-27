import java.util.Scanner;

public class MaximumDifference {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size");
      int n = sc.nextInt();
      System.out.println("enter the array element");
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }

      int maximumDifference = Integer.MIN_VALUE;

      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            if (arr[j] - arr[i] > maximumDifference) {
               maximumDifference = arr[j] - arr[i];
            }
         }
      }

      System.out.println(maximumDifference);
      sc.close();
   }
}