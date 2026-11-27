import java.util.Scanner;
public class LeftRotate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        System.out.println("enter the array element");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int temp = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] =arr[i+1];

        }
        arr[n-1]=temp;

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}