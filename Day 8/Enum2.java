class Enum2{
    public enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
    public static void main(String[] args){
        for(Days d: Days.values()){
            System.out.println(d);
        }
        System.out.println("The value of Sunday is "+Days.valueOf("SUNDAY"));
        System.out.println("The Index of Monday is "+Days.valueOf("MONDAY").ordinal());
        System.out.println("The Index of Saturday is "+Days.valueOf("SATURDAY").ordinal());

    }
}