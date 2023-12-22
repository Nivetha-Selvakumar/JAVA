public class Exception13 {
    public static void main(String[] args){
        try{
            int data=10/0;
            System.out.println("Code executed");
        }
        catch (ArithmeticException e){
            System.out.println("Arithematic Exception ");
            System.out.println(e);
        }
        finally{
            System.out.println("Finally also executed");
        }
        System.out.println("try catch executed");
    }
}