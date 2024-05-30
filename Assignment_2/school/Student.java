package school;
public class Student {
    protected String name;
   protected int roll;
    public void inputDetails(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
    }
}
