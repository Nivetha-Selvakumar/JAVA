import java.io.*;
public class Depersit {
    public static void main(String[] args){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("File.txt"));
            Students s= (Students)in.readObject();
            System.out.println(s.id+ " "+s.name);
            in.close();
        }catch(Exception e){System.out.println(e);}

    }

}