class th implements Runnable{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class th1 implements Runnable{
    public void run()
    {
        int a=5;
        for(int i=1;i<=10;i++)
        {
            System.out.println(a*i);
        }
    }
}
public class threadwithrunnable {
    public static void main(String[] args) {
        th t=new th();
        Thread w=new Thread(t);
        th1 t1=new th1();
        Thread e=new Thread(t1);
        w.start();
        e.start();
    }
}
