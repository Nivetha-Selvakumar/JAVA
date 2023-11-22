class Load{
    public static void display(char a,char b){
        System.out.println("It is all about 2 char: "+a+" "+b);
    }
    public static void display(char a,char b,char c){
        System.out.println("It is all about 3 char: "+a+" "+b+" "+c);
    }
    public static void display(char a,char b,char c,char d){
        System.out.println("It is all about 4 char: "+a+" "+b+" "+c+" "+d);
    }
    public static void display(String a,String b){
        System.out.println("It is all about 2 String:  "+a+" "+b);
    }
}
class Overload2{
    public static void main(String[] args){
        Load obj= new Load();
        obj.display("nivetha","selvakumar");
        obj.display('s','s','n');
        obj.display('s','s','n','a');

    }
}