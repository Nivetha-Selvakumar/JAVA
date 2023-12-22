public class Exception11 {
    public static void main(String[] args){
        try{
            int data=10/2;
            System.out.println("Code executed");
        }
        catch (ArithmeticException e){
            System.out.println("Arithematic Exception ");
        }
        finally{
            System.out.println("Finally also executed");
        }
        System.out.println("try catch executed");
    }
}