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
        for (int i = 0; i!=-1; i++) {
            if (i==10){
                //make trivia questions on some kind of fantasy thing to keep with the main theme. (call)
            }
            System.out.println(s.Situation2());
            int modeSelector = ((int)(Math.random()*20))+1;
            if (modeSelector>10){
                System.out.println(s.Question());
                System.out.println("Place your answer (round to nearest integer if necessary");
                System.out.println(s.Answer(f.nextDouble()));
                if (!s.Answered()) {
                    System.out.println("Your score was: " + i);
                    i = -2;
                    System.out.println("YOU LOSE");
                }
            }
            else if (modeSelector<10){
                int dice = s.Dice();
                if(dice>10){
                    System.out.println("It appears RNGsus is on your side");
                }
                else{
                    System.out.println("RNGsus says ur fat and u died");
                    System.out.println("Your score was: " + i);
                    i = -2;
                    System.out.println("YOU LOSE");
                }




















































            }
        }

    }
}