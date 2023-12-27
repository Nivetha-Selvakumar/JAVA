interface  Sayable {
    void say();
}
public class MethodReference {
    public static void saySomething(){
        System.out.println("Hello everyone");
    }
    public static void main(String[] args){
        Sayable sayable = MethodReference::saySomething;
        sayable.say();
    }
}