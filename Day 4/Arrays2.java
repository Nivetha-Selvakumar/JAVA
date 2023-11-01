import java.util.Scanner;
class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int a;
        a = sc.nextInt();
        System.out.println("Enter the elements :");
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("print elements:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("");
        for ( int k=0;k<a;k++){
            for(int j=k+1;j<a;j++){
                if(arr[j]<arr[k]){
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Ascending order:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}