
    class student{
        int rollno;
        String name;
        public void getdata()
        {
            System.out.println("Roll No:"+rollno);
            System.out.println("Name:"+name);
        }
    }
public class classandobject {
    public static void main(String[] args) {
        student st= new student();
        st.rollno=12;
        st.name="Tirth";
        st.getdata();
    }
}
