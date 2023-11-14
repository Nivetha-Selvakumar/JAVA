import java.util.Scanner;

public class Method2{
    public static void main(String[]args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        pattern(a);
        pattern(b);

    }
    public static int pattern(int num1) {
        for(int i=0;i<num1;i++){
            for(int j=i;j<num1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        return 1;
    }
}