import java.lang.*;

class IceCream{
    public void food(){System.out.println("Its about IceCream");}
}
class Vennila extends IceCream{
    public void food(){System.out.println("Vennila IceCream");}
}
class Polymorph1{
    public static void main(String[] args){
        IceCream obj2=new IceCream();
        obj2.food();
        IceCream obj1=new Vennila();
        obj1.food();

    }
}