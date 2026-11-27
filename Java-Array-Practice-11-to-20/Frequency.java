import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occur " + count + " times");
        }

        sc.close();
    }
}