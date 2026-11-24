import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arrya");
        int n = sc.nextInt();

        System.out.println("enter the elements of arrays");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int positivecount=0;
        int negativecount=0;
        int zerocount =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                positivecount++;
            }else if(arr[i]<0){
                negativecount++;
            }else{
                zerocount++;
            }
        }
        System.out.println(positivecount);
        System.out.println(negativecount);
        System.out.println(zerocount);
    }
}