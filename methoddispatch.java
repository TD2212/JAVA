class phone{
    void ring()
    {
        System.out.println("Phone is ringing...");
    }
    void time()
    {
        System.out.println("Phone is show time");
    }
}
class smartPhone extends phone{
void ring()
{
    System.out.println("smart phone is ringing...");
}
void music()
{
    System.out.println("Smartphone is play music");
}
}

public class methoddispatch {
    public static void main(String[] args) {
        phone p=new smartPhone();
        p.ring();
        p.time();
      //  p.music();//not run this method because the reference is the super class and super class dont have this method
    }    
}
