import java.util.Arrays;

public class Parallel1 {
    public static void main(String[] args){
        int[] arr= {10,9,3,6,2,5};
        for(int i: arr){
            System.out.print(i+" ");
        }
        Arrays.parallelSort(arr);
        System.out.println("\nSorted array: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}