package school;
 public class Test extends Student{
    protected int mark1;
    protected int mark2;
    public void inputDetails(String name, int roll, int mark1, int mark2){
        super.inputDetails(name, roll);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Mark 1: "+mark1);
        System.out.println("Mark 2: "+mark2);
    }
}
