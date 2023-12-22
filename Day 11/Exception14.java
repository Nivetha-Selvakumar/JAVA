public class Exception14 {
    public static void main(String[] args){
        int a=10;
        if (a < 18) {
                throw new ArithmeticException("Lesser than 18");
            }
        else {
                System.out.println("Greater");
        }
        System.out.println("rest of code");

    }
}