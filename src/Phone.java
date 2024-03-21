import java.util.*;
public class Phone{
    String area_code,exchange,number;
    Phone(String area_code, String exchange, String number){
        this.area_code = area_code;
        this.exchange = exchange;
        this.number  = number;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area code: ");
        this.area_code = sc.nextLine();
        System.out.print("Enter the exchange: ");
        this.exchange = sc.nextLine();
        System.out.print("Enter the number: ");
        this.number = sc.nextLine();
    }
    void display(){
        System.out.printf("(%s) %s-%s",this.area_code,this.exchange,this.number);
    }
}
     class PhoneDriver{
    public static void main(String[] args){
        Phone number1 = new Phone("212","767","8900");
        Phone number2 = new Phone("","","");
        number2.input();
        System.out.print("My number is ");
        number1.display();
        System.out.print("\nYour number is ");
    }
}