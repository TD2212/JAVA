class animal
{
    public void sleep()
    {
        System.out.println("It can sleep");
    }
    public void food()
    {
        System.out.println("It can eat food");
    }
    public void drink()
    {
        System.out.println("It can drink water");
    }
}
class dog extends animal{
    public void bark()
    {
        System.out.println("Dog can bark");
    }
}
public class inherirtance {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.food();
        d.drink();
        d.sleep();
    }
}
