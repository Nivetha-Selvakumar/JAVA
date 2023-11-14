import java.util.Scanner;

public class Method4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Factorial(num));
    }
    static int Factorial(int n){
        int mul=1;
        for(int i=1;i<=n;i++){
            mul=mul*i;
        }
        return mul;
    }
}