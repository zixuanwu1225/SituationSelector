import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Interface {
    public static void main(String[] args) {
        SituationSelector s = new SituationSelector();
        Scanner f = new Scanner(System.in);
        for (int i = 0; i!=-1; i++) {
            int modeSelector = ((int)(Math.random()*20))+1;
            if (i%10==0){
                modeSelector = -1;
                System.out.println(s.MiniBoss()+". true or false?");
                boolean correct = (s.MiniBossAnswer(f.nextLine()));
                if (!correct){
                    System.out.println("You are not big brain enuff");
                    System.out.println("Your score was: " + i);
                    i = -2;
                    System.out.println("YOU LOSE");
                }
            }
            if (modeSelector>10&&modeSelector!=-1){
                System.out.println(s.Situation2());
                System.out.println(s.Question());
                System.out.println("Place your answer (round to nearest integer if necessary");
                System.out.println(s.Answer(f.nextDouble()));
                if (!s.Answered()) {
                    System.out.println("Your score was: " + i);
                    i = -2;
                    System.out.println("YOU LOSE");
                }
            }
            else if (modeSelector<10&&modeSelector!=-1){
                System.out.println(s.Situation2());
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