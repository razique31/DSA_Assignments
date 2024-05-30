 public class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 class Employee extends Person1{
    int eid;
    double salary;
    Employee(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }
    void empDisplay(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+eid);
        System.out.println("Salary: $"+salary);
        System.out.println();
    }
    public static void main(String[] args){
        Employee emp1 = new Employee("Rohan",30,104,90000.0);
        emp1.empDisplay();
        Employee emp2 = new Employee("Rahul", 34,34,12000.6);
        emp2.empDisplay();
    }
}
