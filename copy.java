import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arrya");
        int n = sc.nextInt();

        System.out.println("enter the elements of arrays");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("original arrays" + arr[i]);
        }



        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
            System.out.println("copied array" + copy[i]);
        }

        sc.close();
    }
}


