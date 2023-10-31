import java.lang.String;
public class Strings {
    public static void main(String[] args) {
        String str="Nivetha Selvakumar";
        String s1="Nive";
        String s2="Nive";
        String s3="nive";
        char[] ch={'n','i','v','e'};
        String s4=new String(ch);
        StringBuffer s5=new StringBuffer("Nive");
        StringBuilder s6=new StringBuilder("Nive");
        String s7=new String("Nive");
        String s="Nivetha"+ " Selvakumar";
        String s8="Nivetha";
        String s9="Selvakumar";
        int i=10;
        String s10=String.valueOf(i);
        //equals 
        System.out.println("work on equal");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s7);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equals(s7));
        System.out.println(s1.equals(s4));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
        //concatenation
        System.out.println("String concatenation");
        System.out.println(s);
        System.out.println(s8.concat(s9));
        //substring
        System.out.println("Substring");
        System.out.println(s.substring(8,18));
        //other methods
        System.out.println("Other methods:");
        System.out.println("Uppercase:"+ str.toUpperCase());
        System.out.println("Lowercase:"+ str.toLowerCase());
        System.out.println("trim:"+ str.trim());
        System.out.println("Strats with:"+ str.startsWith("n")+"endswith:"+str.endsWith("a"));
        System.out.println("Char at"+ str.charAt(4));
        System.out.println("length:"+ str.length());
        System.out.println("Intern:"+ str.intern());
        System.out.println("Value of :"+ s10);
        System.out.println("Replace:"+ str.replace('a','i'));
        System.out.println("formate: %c "+ i);
        System.out.println("Getbytes:"+ str.getBytes());
        System.out.println("Index of:"+ str.indexOf('a'));
        System.out.println("isEmpty:"+ str.isEmpty());
        System.out.println("LastIndexof:"+ str.lastIndexOf('s',9));
        System.out.println("replace all:"+ str.replaceAll("e","i"));
        System.out.println("split:"+ str.split(" "));
        
    }    
}
