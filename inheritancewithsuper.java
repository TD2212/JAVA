class grandparent{
    private int x;
    grandparent()
    {
        System.out.println("This is grandparent class");
    }
    grandparent(int x)
    {
        
        System.out.println("Grandparent class with value="+x);
    }
  
}
class parent extends grandparent{
    private int y;
    parent()
    {
        System.out.println("This is parent class");
    }
    parent(int x,int y)
    {
        super(x);
        {
            System.out.println("Parent class with value="+y);
        }
    }
}
class child extends parent{
    private int z;
    child()
    {
        System.out.println("This is a child class constructor");
    }
    child(int x,int y,int z)
    {
        super(x,y);
        System.out.println("Child class with value="+z);
    }
}
public class inheritancewithsuper {
    public static void main(String[] args) {
        child ch =new child(2,3,4);
    }
}
