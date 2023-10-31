import java.util.Scanner;

public class Desicion3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>90){
            System.out.println("O grade");
        }
        else if(a>80 && a<=90){
            System.out.println("A+ grade");
        }
        else if(a>70 && a<=80){
            System.out.println("A grade");
        }
        else if(a>60 && a<=70){
            System.out.println("B+ grade");
        }
        else if(a>50 && a<=60){
            System.out.println("b grade");
        }
        else{
           
            System.out.println("below average");
        }
    }

}