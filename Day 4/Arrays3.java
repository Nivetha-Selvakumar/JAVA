import java.util.Scanner;
public class Arrays3 {
    static void max(int arr1[]){
        int max= arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        max(arr);
    }

}