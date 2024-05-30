public class Commission {
    int sales;
    Commission(int sales){
        this.sales = sales;
    }
    double getCommission(){
        if (sales<100){
            return (sales*2.0)/100;
        } else if (sales > 500 && sales< 5000) {
            return (sales*5.0)/100;
        } else{
            return (sales*8.0)/100;
        }
    }
}
class Demo{

}
