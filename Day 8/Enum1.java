class Enum1{
    public enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
    public static void main(String[] args){
        for(Days d: Days.values()){
            System.out.println(d);
        }
    }
}