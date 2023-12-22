public class Exception4 {
    public static void main(String[] args){
        try{
            int a=100/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index");
        }
        catch(ArithmeticException e){
            System.out.println("Arthematic exception");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Array index");
        }
        catch (Exception e){
            System.out.println("Other Index");
        }

        System.out.println("Print other code");

    }
}