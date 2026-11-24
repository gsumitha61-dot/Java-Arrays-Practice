import java.util.Scanner;
public class evenodd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of arrays");
        int arr[]=new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }
        int evencout=0;
        int oddcount=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                evencout++;
            }else{
                oddcount++;
            }

            
        }

          System.out.println(evencout);
            System.out.println(oddcount);

    }
    
}
