import java.util.*;
public class Generic1 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Nivetha");
        list.add("Selvakumar");
        //list.add(32); compile time error
        String s= list.get(1);
        System.out.println("Element is "+s);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}