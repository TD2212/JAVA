class Employee {   
    private String name;    
    private int id;     
    private int salary;     

    public Employee(int id, int salary) {   
        this.id = id;   
        this.salary = salary;  
        this.name = ""; // Initializing name to avoid null values  
    }    

    String getName() { return name; }    
    int getSalary() { return salary; }    
    int getId() { return id; }    
    void setName(String name) {  
        this.name = name;   
    } 
}    

public class Constructor {    
    public static void main(String[] args) {    
        Employee e = new Employee(10, 10000);    
        e.setName("Tirth");    
        System.out.println("Salary: " + e.getSalary());    
        System.out.println("Name: " + e.getName());    
        System.out.println("Id: " + e.getId());    
    }    
}
