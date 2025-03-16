class spare{
    private int radius;
    public spare(int radius)
    {
        this.radius=radius;
    }
   
    public int getdata()
    {
        return radius;
    }
    public void area()
    {
        System.out.println("Spare area="+4*Math.PI*radius*radius);
    }
    public void volume()
    {
        System.out.println("Spare volume"+(4*Math.PI*radius*radius*radius)/3);
    }
}
public class spareareaandsurface {
    public static void main(String[] args) {
        spare s=new spare(5);
        s.getdata();
        s.area();
        s.volume();
    }
}
