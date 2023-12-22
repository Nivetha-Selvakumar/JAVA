public class Exception6 {
    public static void main(String[] args){
        try{
            int arr[]=new int[5];
            arr[7]=9;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index");
        }

        catch (StringIndexOutOfBoundsException e){
            System.out.println("String index");
        }
        catch (Exception e){
            System.out.println("Other Index");
        }

        System.out.println("Print other code");

    }
}