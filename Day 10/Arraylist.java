import java.util.*;
class Arraylist {
    public static void main(String[] args){
        int n=10;
        List<Integer> Arrl1= new ArrayList<Integer>(n);
        for (int i=0;i<n;i++){
            Arrl1.add(i);
        }
        System.out.println(Arrl1);
        Arrl1.remove(6);
        System.out.println(Arrl1);
        System.out.println(Arrl1.size());
    }
}