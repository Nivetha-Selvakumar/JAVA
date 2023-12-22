public class Exception12 {
    public static void main(String[] args){
        try{
            int data=10/0;
            System.out.println("Code executed");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("String Exception ");
        }
        finally{
            System.out.println("Finally also executed");
        }
        System.out.println("try catch executed");
    }
}