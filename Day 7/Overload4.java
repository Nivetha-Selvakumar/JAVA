class Overload4{
    private String formatNumber(int val){

        return String.format("%d",val) ;
    }
    private String formatNumber(double val){

        return String.format("%.3f",val);
    }
    private String formatNumber(int val,int val2){

        return val+String.format("%d",val2);
    }
    public static void main(String[] args){
        Overload4 obj=new Overload4();
        System.out.println("Change int");
        obj.formatNumber(18);
        System.out.println("Change double to string");
        obj.formatNumber(18.09);
        System.out.println("Change to String");
        obj.formatNumber(18,20);

    }
}