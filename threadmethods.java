class th extends Thread{
    th(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("ENTER NAME="+this.getName());
    }
}
class th1 extends Thread{
    th1(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("ENTER NAME="+this.getName());
    }
}
public class threadmethods {
    public static void main(String[] args) {
        th t= new th("Tirth");
        th1 t1=new th1("manthan");
        try{
            t1.join();
        }
        catch(Exception e)
        {
            System.out.println("no"+e);
        }
        t.start();
        t1.start();
    }
}
