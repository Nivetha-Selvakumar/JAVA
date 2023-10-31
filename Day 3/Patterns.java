import java.util.Scanner;

public class Patterns {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a=sc.nextInt();
        //for loop
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
