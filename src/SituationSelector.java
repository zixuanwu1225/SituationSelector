import java.text.DecimalFormat;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public class SituationSelector {
    private int diceValue = 0;
    private int operators = 0;
    private String actualOperators = "";
    private double answer = 0;
    private int score = 0;
    private int MiniBossNumber = 0;
    private int option = 0;
    DecimalFormat d = new DecimalFormat(".0");

    ArrayList<String>Situations=new ArrayList<String>(
            Arrays.asList("You see a strange array, that displays the following:","Your party encounters a pack of goblins")
        );
    //Situation 3 gets numbers from Array list
    ArrayList<String>MiniBosses=new ArrayList<String>(
            Arrays.asList("It is possible for atoms to be in two places at once","It is possible for light to go forwards and backwards in time at the same time","The closest black-hole to earth 1600 light years away",
                    "The earth is flat","Pluto is larger than Earth's Moon")
    );

    //Situation 2 gets what situation you are given
    public String Situation2(){
        //gets random thing in array Situations
        return Situations.get((int) (Math.random() * Situations.size()));
    }
    public String MiniBoss(){
        MiniBossNumber =  ((int)(Math.random()*MiniBosses.size()));
        return MiniBosses.get(MiniBossNumber);
    }
    public boolean MiniBossAnswer(String Answer){
        if (MiniBossNumber==0){
            if (Answer.equals("true")){
                return true;
            }
            else {
                return false;
            }
        }
        if (MiniBossNumber==1){
            if (Answer.equals("true")){
                return true;
            }
            else {
                return false;
            }
        }
        if (MiniBossNumber==2){
            if (Answer.equals("true")){
                return true;
            }
            else {
                return false;
            }
        }
        if (MiniBossNumber==3){
            if (Answer.equals("false")){
                return true;
            }
            else {
                return false;
            }
        }
        if (MiniBossNumber==4){
            if (Answer.equals("false")){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public int Dice(){
        diceValue = ((int)(Math.random()*20))+1;
        return diceValue;
    }
    public String Question(){
        operators = (int)(Math.random()*4)+1;
        int values = (int)(Math.random()*10)+1;
        int secondValue = (int)(Math.random()*10)+1;
        String theQuestion = "";
        if(operators == 4){
            actualOperators = "+";
        }
        else if (operators ==3){
            actualOperators = "-";
        }
        else if (operators == 2){
            actualOperators = "*";
        }
        else if (operators == 1){
            actualOperators = "/";
        }
        if (Objects.equals(actualOperators, "+"))
        {
            answer = Math.round(values+secondValue);
        }
        if (Objects.equals(actualOperators, "-"))
        {
            answer = Math.round(values-secondValue);
        }
        if (Objects.equals(actualOperators, "*")){
            answer = Math.round(values*secondValue);
        }
        if (Objects.equals(actualOperators, "/"))
        {
            if(values/(double)secondValue>Math.round(values/secondValue)+0.5) {
                answer = (Math.round(values / secondValue)) + 1;
            }
            else {
                answer = Math.round(values / secondValue);
            }
        }
        for (int i =0;i!=2;i++) {
            theQuestion = (values + actualOperators+secondValue);
        }
        return theQuestion;
    }
    public String Answer(double playerAnswer){
        score = 0;
        if(playerAnswer==answer){
            score=score+1;
            return "You passed.You move on to the next level.";
        }
        else
            return "Your party got Indiana Jones'd except this time died";
    }
    public boolean Answered(){
        if(score==1){
            return true;
        }
        return false;
    }
}
