import java.util.Scanner;
public class Array5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str.length());
        String[] num= str.split(" ");
        for(String s:num){
            StringBuilder rev= new StringBuilder(s).reverse();
            System.out.println(rev);
        }

    }
}