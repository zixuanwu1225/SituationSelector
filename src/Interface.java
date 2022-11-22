import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Interface {
    public static void main(String[] args) {
        System.out.println("Hello Player....welcome to \"Situation Survivor\".");
        SituationSelector s = new SituationSelector();
        for (int i = 0; i!=-1; i++) {
            Scanner f = new Scanner(System.in);
            int modeSelector = ((int)(Math.random()*20))+1;
            if (i%10==0){
                modeSelector = -1;
                s.MiniBoss();
                System.out.println("_____________________________MINI_BOSS_____________________________________");
                System.out.println(s.MiniBoss()+". true or false?");
                boolean correct = (s.MiniBossAnswer(f.nextLine().toLowerCase()));
                if (!correct){
                    System.out.println("You are not big brain enuff");
                    System.out.println("Your score was: " + i);
                    i = -2;
                    System.out.println("YOU LOSE");
                }
                System.out.println("___________________________________________________________________________");
            }
            if (modeSelector>10&&modeSelector!=-1){
                System.out.println("___________________________________________________________________________");
                System.out.println(s.getSituation());
                System.out.println("You must answer the following question to beat your adversary");
                System.out.println(s.Question());
                System.out.println("Place your answer (round to nearest integer if necessary");
                System.out.println(s.Answer(f.nextDouble()));
                if (!s.Answered()) {
                    System.out.println("Your score was: " + i);
                    i = -2;
                    System.out.println("YOU LOSE");
                }
                System.out.println("___________________________________________________________________________");
            }
            else if (modeSelector<10&&modeSelector!=-1){
                System.out.println("___________________________________________________________________________");
                System.out.println(s.getSituation());
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
                System.out.println("___________________________________________________________________________");
            }
        }
    }
}