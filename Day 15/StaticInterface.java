interface NewInterface{
    static void hello(){
        System.out.println("Hello,new static method");
    }
    void overrideMethod(String str);
}
public  class StaticInterface implements  NewInterface{
    public static void main(String[] args){
        StaticInterface staticInterface= new StaticInterface();
        NewInterface.hello();
        staticInterface.overrideMethod(("Hello, override"));
    }
    @Override
    public void overrideMethod(String str){
        System.out.println(str);

    }
}
