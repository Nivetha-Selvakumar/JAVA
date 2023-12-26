import java.lang.String;
import java.io.*;
public class Persist {
    public static void main(String[] args) {
        try {
            Students s= new Students(111, "Nive");
            FileOutputStream fout = new FileOutputStream("File.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s);
            out.flush();
            System.out.println("Sucess");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}