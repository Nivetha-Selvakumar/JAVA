import java.util.Scanner;
class ArrayFrequency {
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
        System.out.println("");

        int arr2[]= new int[a];
        int flag=-1;
        for(int i=0;i<a;i++){
            int count=1;
            for(int j=i+1;j<a;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr2[j]=flag;
                    }

            }
            if(arr2[i]!=-1)
                System.out.println(arr[i]+":"+count);
        }

    }
}