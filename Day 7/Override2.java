class Humans{
    public void eat(){
        System.out.println("Human Eat");
    }
}
class Boys extends Humans{
    public void eat(){
        System.out.println("Boy is Eating");
    }
}
class Boys2 extends Boys{
    public void eat(){
        System.out.println("Boys2 is Eating");
    }
}
class Override2{
    public static void main(String[] args){
        Humans obj1=new Humans();
        Humans obj2=new Boys();
        Boys obj3=new Boys2();
        obj1.eat();
        obj2.eat();
        obj3.eat();
    }
}