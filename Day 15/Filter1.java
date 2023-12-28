import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
        /*ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);*/
        //creating collection
        List<Integer> numberList = Arrays.asList(10,15,20,25,30,35,40,45,50);
        List<Integer> evenNumberList = new ArrayList<Integer>();
        List<Integer> evenNumberList2 = new ArrayList<Integer>();

        //without using streams
        for(int n: numberList){
            if(n%2==0){
                evenNumberList.add(n);
            }
        }
        System.out.println("Without using stream: "+ evenNumberList);

        //using stream concept by filter method
        evenNumberList2= numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Using Stream: "+ evenNumberList2);

        //without stoing in a variable
        numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));




    }
}

