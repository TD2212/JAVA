class Thr1 extends Thread{
   public Thr1(String name)
    {
        super(name);
    }
    public void run()
    {
     System.out.println("Students="+this.getName());
    }
}

class threadprorityandconstuctor{

    public static void main(String[] args) {

    Thr1 t1=new Thr1("Tirth");
    Thr1 t2=new Thr1("Man");
    Thr1 t3=new Thr1("Manthan");
    Thr1 t4=new Thr1("Amit");
    Thr1 t5=new Thr1("Rakesh");
    t1.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

  }
}