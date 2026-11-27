import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];for (int a = 0; a < n; a++) {
    
                    arr[j + 1] = temp;
                }
            }
        }

        // Remove duplicates
        int uniqueIndex = 0;
        int j = 1;

        while (j < n) {
            if (arr[uniqueIndex] != arr[j]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[j];
            }
            j++;
        }

        int uniqueCount = uniqueIndex + 1;
        for (int k = 0; k < uniqueCount; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}
}
