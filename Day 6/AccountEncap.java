package accEncap;
public class AccountEncap {
    private long acc_num;
    private String name;
    private int age;
    private float amt;
    public long getAcc_num(){
        return acc_num;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public float getAmt(){
        return amt;
    }
    public void setAcc_num(long acc_num){
        this.acc_num=acc_num;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAmt(float amt){
        this.amt=amt;
    }
}