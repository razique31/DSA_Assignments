 public class Deposit {
    long principle;
    int time;
    double rate, totalAmt;
    Deposit(){
        principle = 0;
        rate = 0.0;
        time = 0;
        totalAmt = 0.0;
    }
    Deposit(long principle, int time, double rate){
        this.principle = principle;
        this.time = time;
        this.rate = rate;
        //calcAmt();
    }
    Deposit(long principle, int time){
        this.principle = principle;
        this.time = time;
        //calcAmt();
    }
    Deposit(long principle, double rate){
        this.principle = principle;
        this.rate = rate;
        //calcAmt();
    }
    void display(){
        System.out.println("Principle: "+principle);
        System.out.println("Time: "+time);
        System.out.println("Rate: "+rate);
        System.out.println("Total Amount: "+totalAmt);
        System.out.println();
    }
    void calcAmt(){
        totalAmt = principle + (principle*rate*time)/100;
    }
    public static void main(String[] args){
        Deposit d1 = new Deposit();
        d1.display();
        Deposit d2 = new Deposit(14000,4, 6.77);
        d2.display();
        Deposit d3 = new Deposit(14000,4);
        d3.display();
        Deposit d4 = new Deposit(14000,5.77);
        d4.display();
    }
}
