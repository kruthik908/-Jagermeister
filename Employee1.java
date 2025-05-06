public class Employee1 {
    String name;
    int id;
    double salary;
    Long phno;
    public Employee1(String name, int id, double salary, Long phno) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phno = phno;
    }
    public void displayInfo(){
        System.out.println("Employee ID:" +id);
        System.out.println("Employee Name:" +name);
        System.out.println("Employee Salary:" +salary);
        System.out.println("Employee Phone Number:" +phno);
    }
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1 ("xyz", 101, 50000.0,6360006574L);
        emp1.displayInfo();

    }
}
