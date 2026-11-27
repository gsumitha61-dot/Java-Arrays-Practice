import java.util.Scanner;
public class SecondSmallest {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int arr[] = new int[n];
         

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int smallest= arr[0];
        int secondsmallest = Integer.MAX_VALUE;

   for(int i=0; i<n; i++){
    if(arr[i] < smallest){
        secondsmallest = smallest;
        smallest= arr[i];
    } else if(arr[i] > smallest &&  arr[i] < secondsmallest){
         secondsmallest = arr[i];
    }

   }
    System.out.println("Second Smallest:"+secondsmallest);
    }
}
