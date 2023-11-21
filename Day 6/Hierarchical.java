class Fruits{
    void eat(){System.out.println("All are fruits");}
}
class Apple extends Fruits{
    void f1(){System.out.println("It is apple");}
}
class Orange extends Fruits{
    void f2(){System.out.println("It is orange");}

}
class Hierarchical{
    public static void main(String[] args){
        Orange h1=new Orange();
        Apple h2= new Apple();
        h1.eat();
        h1.f2();
        h2.eat();
        h2.f1();
        //gives error h1.f1(); also h2.f2();

    }
}