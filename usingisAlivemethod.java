import java.util.*;
public class usingisAlivemethod{
    public static void main(String args[]){
        Runnable r=()->System.out.println("iam new from java8 version");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.isAlive());
    }
}