public class Exception2 {
    public static void main(String[] args){
        try{
            int a=100/0;
            System.out.println("Print other code");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}