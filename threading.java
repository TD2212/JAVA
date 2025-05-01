class the extends Thread{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
        System.out.println("Hello World");
        }
    }
}
class the1 extends Thread{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
        System.out.println("Good moring");
        }
    }
}

public class threading {
    public static void main(String[] args) {
        the t=new the();
        the1 t1=new the1();
        t.start();
        t1.start();
    }
}
