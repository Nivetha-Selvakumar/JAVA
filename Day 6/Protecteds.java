import java.util.Scanner;

class AA{
    protected String name;
    protected void display(){
        System.out.println("Here Protected");
    }
}
class BB extends AA{
    public void getInfo(){
        System.out.println("Here Info: "+ name);
    }
}
class Protecteds {
    public static void main(String[] args){
        BB obj= new BB();
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        obj.name=a;
        obj.display();
        obj.getInfo();


    }
}