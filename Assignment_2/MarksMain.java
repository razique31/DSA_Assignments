 abstract class Marks {
    double markICP, markDSA, percentage;
    Marks(double markICP, double markDSA){
        this.markICP = markICP;
        this.markDSA = markDSA;
    }
    abstract void getPercentage();
}
 class CSE extends Marks{
    double algoDesign;
    CSE(double markICP, double markDSA, double algoDesign){
        super(markICP,markDSA);
        this.algoDesign = algoDesign;
        getPercentage();
    }
    @Override
    public void getPercentage(){
        percentage = (markICP+markDSA+algoDesign)/3;
    }
}
 class NonCSE extends Marks{
    double enggMechanics;
    NonCSE(double markICP, double markDSA, double enggMechanics){
        super(markICP,markDSA);
        this.enggMechanics = enggMechanics;
        getPercentage();
    }
    @Override
    public void getPercentage(){
        percentage = (markICP+markDSA+enggMechanics)/3;
    }
}
public class MarksMain{
    public static void main(String[] args){
        CSE cseStudent = new CSE(95.7,93.4,82.66);
        NonCSE nonCseStudent = new NonCSE(74.1,59.8,91.35);
        System.out.printf("Percentage of CSE Student: %.2f%% %n",cseStudent.percentage);
        System.out.printf("Percentage of Non CSE Student: %.2f%%",nonCseStudent.percentage);

    }
}
