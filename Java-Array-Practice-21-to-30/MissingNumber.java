import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        System.out.println("enter the array element");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int actualsum =0;
        for(int i=0; i<n; i++){
            actualsum = actualsum+arr[i];
        }

        int expectedsum = n*(n+1)/2;

        int missing = expectedsum-actualsum;

        System.out.println("Missing number: "+ missing);
    }
    
}
