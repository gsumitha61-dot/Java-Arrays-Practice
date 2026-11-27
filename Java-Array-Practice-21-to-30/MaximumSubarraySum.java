import java.util.Scanner;
public class MaximumSubarraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        System.out.println("enter the array element");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i=1; i<n; i++){
     currentSum = Math.max(arr[i], currentSum + arr[i]); 
     maxSum =Math.max(maxSum,currentSum);    
}
     
        System.out.println("Maximum Subarray Sum: " + maxSum);
    

}
}
