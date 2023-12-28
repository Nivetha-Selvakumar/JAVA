import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {
    public static  void main(String[] args){
        //flat map
        List<Integer> list1= Arrays.asList(1,2);
        List<Integer> list2= Arrays.asList(3,4);
        List<Integer> list3= Arrays.asList(5,6);

        List<List<Integer>> finallist= Arrays.asList(list1,list2,list3);
        List<Integer> finalresult= finallist.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(finallist);
        System.out.println(finalresult);

    }
}