 interface parent {
    void meth1();
    void meth2();   
  }
   interface child extends parent {
    void meth3();
    void meth4();
}
class ch implements child{
    public void meth1()
    {
        System.out.println("This is method 1");
    }
   public void meth2()
    {
        System.out.println("This is method 2");
    }
   public void meth3()
    {
        System.out.println("This is method 3");
    }
   public void meth4()
    {
        System.out.println("This is method 4");
    }
}
public class interfaceinheritance {
    public static void main(String[] args) {
        ch c=new ch();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
    }
}
