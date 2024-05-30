 class Complex {
    double real, imag;
    void setData(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    void display(){
        System.out.printf("%s + %si%n",this.real,this.imag);
    }
    public Complex add(Complex num1,Complex num2){
        Complex sum = new Complex();
        sum.real = num1.real + num2.real;
        sum.imag = num1.imag +num2.imag;
        return sum;
    }
}
 public class ComplexMain{
     public static void main(String[] args){
        Complex com1 = new Complex();
        com1.setData(3.5,4.6);
        Complex com2 = new Complex();
        com2.setData(4.8,5.6);
        System.out.println("original complex numbers are: ");
        com1.display();
        com2.display();
        Complex sum = new Complex();
        sum = sum.add(com1,com2);
        System.out.println("Sum of complex numbers: ");
        sum.display();
    }
}
