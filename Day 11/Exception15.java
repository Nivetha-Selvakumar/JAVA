import java.io.IOException;
class Exception15{
    void m()throws IOException{
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        Exception15 obj=new Exception15();
        obj.p();
        System.out.println("normal flow...");
    }
}