class Human{
       public void eat(){
        System.out.println("Human Eat");
    }
}
class Boy extends Human{
    public void eat(){
        System.out.println("Boy is Eating");
    }
}
class Override1{
    public static void main(String[] args){
        Human obj1=new Human();
        Human obj2=new Boy();
        obj1.eat();
        obj2.eat();
    }
}