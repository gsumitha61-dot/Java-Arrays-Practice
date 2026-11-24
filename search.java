import java.util.Scanner;

public class search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element found at index " + position);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}