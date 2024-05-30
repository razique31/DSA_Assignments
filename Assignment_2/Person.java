import java.util.*;
  public class Person {
    String name;
    int age;
     void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
    }
    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rohan";
        p1.age = 20;
        Person p2 = new Person();
        p2.setData();
        System.out.println("Details of person 1: ");
        p1.displayData();
        System.out.println("Details of person 2: ");
        p2.displayData();
        if (p1.age > p2.age) {
            System.out.println("Rohan is younger");
        } else if (p1.age < p2.age) {
            System.out.printf("%s is younger", p2.name);
        } else {
            System.out.println("Both are of same age");
        }
    }
}

