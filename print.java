import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        sc.close();
    }
}
