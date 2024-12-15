import java.util.*;
class a extends Thread{
    public void r()
    {
        System.out.println("Hello i'm thread");
    }
}
public class extendingthreadclass{
    public static void main(String args[]){
    a g=new a();
    g.r();
    g.start();
    }
}