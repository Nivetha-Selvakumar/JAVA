import java.util.*;

public class Vectorclass {
    public static void main(String[] args){
        List<Integer> vec= new Vector<Integer>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0)
                vec.add(i-1);
            else
                vec.add(i+1);
        }
        System.out.println(vec);
    }
}