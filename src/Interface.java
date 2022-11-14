import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Interface {
    public static void main(String[] args) {
        ArrayList<Integer> SituationAsk=new ArrayList<Integer>(
                Arrays.asList(1,2,3,4,5,6,7,8,9,10)
        );
        SituationAsk.get((int)(Math.random()*SituationAsk.size()));
        SituationSelector s = new SituationSelector();
        Scanner f = new Scanner(System.in);
        for (int i = 0; i<10; i++) {
            System.out.println(s.Situation2());
            System.out.println(s.Question());
            System.out.println("Place your answer (round to nearest integer if necessary");
            System.out.println(s.Answer(f.nextDouble()));
            if (!s.Answered()){
                i=10;
                System.out.println("YOU LOSE");
            }
        }

    }
}