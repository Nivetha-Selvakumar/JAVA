// Thread(String Name)
public class Thread2 implements Runnable{
    public static void  main(String args[])
    {
     Thread t = new Thread("New Thread working as Thread(String)");
     t.start();
     String str = t.getName();
     System.out.println(str);
    }


}