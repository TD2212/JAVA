abstract class shape{
    abstract void rectangle(int l,int w);
    abstract void squre(int a);
    abstract void circle(int r);
}
 class Rectangle extends shape{
    void rectangle(int l,int w)
    {
        System.out.println("area of rectangle"+(l*w));
    }
    void squre(int a)
    {
        System.out.println("area of squre"+(a*a));
    }
    void circle(int r)
    {
        System.out.println("area of circle"+(Math.PI*r*r));
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
       r.rectangle(3, 4);
       r.circle(4);
       r.squre(5);
    }
}
