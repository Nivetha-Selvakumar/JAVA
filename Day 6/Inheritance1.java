class Inheritance1{
    float amt=5000;
}
class Programming extends Inheritance1{
    int bonus = 800;
    public static void main(String[] args){
        Programming pg= new Programming();
        System.out.println(pg.bonus);
        System.out.println(pg.amt);
    }
}