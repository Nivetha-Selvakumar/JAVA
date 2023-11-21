public class Animal {
    String sound = "Animal Sounds";
}
class Dog extends Animal{
    String bark="It Barks";
}
class Test{
    public static void main(String[] args){
        Dog s=new Dog();
        System.out.println(s.sound);
        System.out.println(s.bark);
    }
}