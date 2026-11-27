import java.util.Scanner;
public class FindDuplicates {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the element of array");
        int arr[] = new int[n];
         

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0; i<n; i++){
            boolean found = false;
            for(int j=i+1; j<n; j++){
            if(arr[i]==arr[j]){
                found= true;
                
                break;
            }
            }
            if(found){
                System.out.println(arr[i]);          
        }
    }
}
}




