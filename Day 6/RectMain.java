package rectEncap;

import java.awt.*;
import java.util.Scanner;

public class RectMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int Area;
        rectEncap.RectInput r=new rectEncap.RectInput();
        Rectangle rt=new Rectangle(a,b);
        Area=a*b;
        System.out.println(Area);
        a=sc.nextInt();
        b=sc.nextInt();
        r.setLength(a);
        r.setBreadth(b);
        Area=a*b;
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println(Area);
    }
}