import java.util.Comparator;

public class InstanceMethod {
    public static void main(String[] args){
        InstanceMethod obj= new InstanceMethod();
        System.out.println(obj.compareNum(10,20));
        Comparator<Integer> comp1= (num1, num2)-> obj.compareNum(num1,num2);
        System.out.println("Comp with lambda: "+ comp1.compare(10,20));
        Comparator<Integer> compareNum= obj::compareNum ;
        System.out.println("Comp with InstanceMethodInterface: "+ compareNum.compare(10,20));

    }
    public int compareNum(int num1, int num2){
        return Integer.compare(num1,num2);
    }
}