public class array {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5};
        
        //System.out.println(num.length);
       // System.out.println("for each loop");
        // for(int numb:num)
        // {
        //     System.out.println(numb);
        // }
        //System.out.println("print array with for loop");
        // for(int i=0;i<num.length;i++)
        // {
        //     System.out.println("number:"+num[i]);
        // }
        //System.out.println("print array with for loop in reverse loop");
        for(int i=num.length-1;i>=0;i--)
        {
            System.out.println(num[i]);
        }
    }
}
