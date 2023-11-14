import java.util.Scanner;

public class Method5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Factorial(num));
    }
    public static int Factorial(int n){
        int mul=1;
        if(n!=0){
            mul=n*Factorial(n-1);
        }
        return mul;
        }

}