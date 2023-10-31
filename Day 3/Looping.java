import java.util.Scanner;
public class Looping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //for loop
        System.out.println("Execution of for loop");
        for(int i=0;i<a;i++){
            System.out.println(i);
        }
        System.out.println("Execution of while loop");
        int j=0;
        while(j<a){
            System.out.println(j);
            j++;
        }
        System.out.println("Execution of do-while loop");
        int k=0;
        do{
            k++;
            System.out.println(k);
            k++;
        }while(k<=a);


    }
}
