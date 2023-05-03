import java.time.LocalDate;

public class Employee {
    Integer id;
    String name;
    String city;
    Double salary;
    LocalDate birthdate;
    
    public Employee(
            Integer id, 
            String name, 
            String city, 
            Double salary, 
            LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.birthdate = birthdate;
    }
    public Employee() {
    }
    
    
}
