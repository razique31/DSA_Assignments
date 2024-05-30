import school.Test;
import sports.Sports;
public class Result extends Test implements Sports{
    public void calTotal(){
        int grandTotalMark = mark1 + mark2;
        int grandTotalScore = score1 + score2;

        System.out.println("Grand total mark: "+grandTotalMark);
        System.out.println("Grand total score: "+grandTotalScore);
    }
    public static void main(String[] args){
        Result results = new Result();
        results.inputDetails("Chase Atlantic", 48,90,93);
        results.calTotal();
    }
}
