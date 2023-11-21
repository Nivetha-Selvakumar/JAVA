class Animals{
    String a="Finding animals";
}
class Dogs extends Animals{
    String b="It is a Dog";
}
class Puppy extends Dogs{
    String c= "It is a puppy";
}
class Multilevel {
    public static void main(String[]args){
        Puppy obj=new Puppy();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

    }


}