import java.util.Scanner;
public class Leader{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        System.out.println("enter the array element");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
            int maxright= arr[n-1];
            System.out.println(maxright);

            for(int i=n-2; i>=0; i--){
                if(arr[i]>maxright){
                    System.out.print(arr[i]);

                    maxright = arr[i];
                }
            }
        sc.close();
    }
}