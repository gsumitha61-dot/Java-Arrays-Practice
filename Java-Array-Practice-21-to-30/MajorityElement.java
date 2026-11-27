import java.util.Scanner;

public class MajorityElement {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size");
      int n = sc.nextInt();
      System.out.println("enter the array element");
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      boolean found = false;

      for (int i = 0; i < n; i++) {
      
    int count = 0;  // Reset for each element

    for (int j = 0; j < n; j++) {
        if (arr[i] == arr[j]) {
            found = true;
            count++;
        }
    }

    if (count > n / 2) {
    System.out.println("Majority element: " + arr[i]);
    break;
}

if (!found) {
    System.out.println("No majority element");
}
}
    }
}

