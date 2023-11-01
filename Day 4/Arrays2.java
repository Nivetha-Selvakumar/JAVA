import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args){
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for (int j:arr){
            System.out.print(arr[j]);
        }
    }
}