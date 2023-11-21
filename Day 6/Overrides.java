class A{
    void eat(){System.out.println("Hello everyone");}
}
class B extends A {
    @Override
    public void eat(){
        super.eat();
        System.out.println("Eat Overrides");
    }
    void beat(){
        System.out.println("Second extends");
    }

}
class Overrides{
    public static void main(String[ ] args){
        B obj=new B();
        obj.eat();
        obj.beat();
    }
}