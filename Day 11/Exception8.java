public class Exception8 {
    public static void main(String[] args){
        int a=10;
        try{
            int c=a/0;
            try{
                int f=10/0;
            }
            catch(ArithmeticException e){
                System.out.println("Block 1");

            }
        }
        catch(Exception e){
            try {
                int b=20/0;
            }
            catch (ArithmeticException g){
                System.out.println("Block 2");
            }

        }
    }
}