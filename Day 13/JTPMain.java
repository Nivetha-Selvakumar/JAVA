package jtp.externalization.test;
import java.io.*;
public class JTPMain {
    public static void main(String... args) throws Exception, IOException{
        File f= new File("Test.txt");
        User u= new User("Nive",21);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(u);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        u=(User)in.readObject();
        System.out.println("After De externalization username: " +u.getUserName()+" and age is:"+u.getAge());
    }
}