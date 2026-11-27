import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter the size of array");
        int m = sc.nextInt();

        System.out.println("enter the element of array");
        int arr2[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(arr1[i] + " common");
            }
        }

        sc.close();
    }
}