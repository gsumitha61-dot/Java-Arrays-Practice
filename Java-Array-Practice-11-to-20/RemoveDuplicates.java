import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
       
             if (found == false) {
    System.out.print(arr[i] + " ");
}
    }
   
}
}
