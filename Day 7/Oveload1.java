class Adder{
    static int sum(int num1,int num2){
        return num1+num2;
    }
    static int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    static double sum(double num1,double num2){
        return num1+num2;
    }
    static double sum(double num1,double num2,double num3){
        return num1+num2+num3;
    }
}
class Overload1{
    public static void main(String[] args){
        Adder obj=new Adder();
        int total;
        total=Adder.sum(10,23);
        System.out.println(total);
        total=Adder.sum(56,100,345);
        System.out.println(total);
        double s;
        s=Adder.sum(78.32,34.92);
        System.out.println(s);
        s=Adder.sum(908.1,92.7,89.0);
        System.out.println(s);

    }
}
