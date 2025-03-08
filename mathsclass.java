class maths{
    int size;
    int lenght;
    int width;
    float pi=3.14f;
    int  r;
    public void squreArea()
    {
        System.out.println("Squre area="+size*size);
    }
    public void squrePt()
    {
        System.out.println("Squre primitive"+4*size);
    }
    public void rectangleArea()
    {
        System.out.println("Rectangle area="+lenght*width);
    }
    public void rectanglePrimitive()
    {
        System.out.println("Rectangel primitive="+2*(lenght+width));
    }
    public void circleArea()
    {
        System.out.println("circle area="+pi*r*r);
    }
    public void circlePrimitive()
    {
        System.out.println("circle primitive="+2*pi*r);
    }
}
public class mathsclass {
    public static void main(String[] args) {
        maths s= new maths();
        maths r=new maths();
        maths c=new maths();
        //squre 
        s.size=3;
        s.squreArea();
        s.squrePt();
        //rectangle
        r.lenght=4;
        r.width=3;
        r.rectangleArea();
        r.rectanglePrimitive();
        //circle
        c.r=5;
        c.circleArea();
        c.circlePrimitive();
    }
}
