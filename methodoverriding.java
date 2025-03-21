class one{
 //   int a,b;
    public void operation(int a,int b)
    {
        System.out.println("Addition");
        System.out.println("one"+a+"two"+b);
        System.out.println(a+b);
    }
}
class two extends one{
    public void operation(int a,int b)
    {
        System.out.println("Substation");
        System.out.println("one"+a+"two"+b);
        System.out.println(a-b);
    }
}
public class methodoverriding{
    public static void main(String[] args) {
        one o=new one();
        o.operation(3, 2);
        two  t=new two();
        t.operation(3,2);
    }
}