import java.util.Comparator;

public class Lambda1 {
    public static void main(String[] args){
        int comp=Lambda1.compareNum(10,20);
        System.out.println("Comp: "+ comp);
        Comparator<Integer> comp1= (num1,num2)-> compareNum(num1,num2);
        System.out.println("Comp with lambda: "+ comp1.compare(10,20));
        Comparator<Integer> compareNum= Lambda1::compareNum ;
        System.out.println("Comp with MethodInterface: "+ compareNum.compare(10,20));
    }
    public static int compareNum(int num1, int num2){
        return Integer.compare(num1,num2);
    }
}