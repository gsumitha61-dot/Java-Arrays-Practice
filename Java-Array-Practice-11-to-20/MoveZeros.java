import java.util.Scanner;
public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < n) {
            arr[j] = 0;
            j++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
