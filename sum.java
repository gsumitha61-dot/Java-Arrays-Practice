import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }

        int sum=0;
        for (int i = 0; i < arry.length; i++) {
            sum =arry[i]+sum;
            System.out.println(sum);
        }
    }
}
