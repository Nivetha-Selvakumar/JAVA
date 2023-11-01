import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("reverse number: ");

        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int rem,sum=0;
            for(int j=1;j>0;j++){
                if(temp>0){
                    rem=temp%10;
                    sum=sum*10+rem;
                    temp=temp/10;
                }
            }
            arr[i]=sum;
            System.out.println(arr[i]);
        }
    }
}