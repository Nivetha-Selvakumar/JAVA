public class Exception1 {
    public static void main(String[] args){
        try{
            int a=100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Print other code");
    }
}