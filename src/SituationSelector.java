public class SituationSelector {
    private int diceValue = 0;
    private int operators = 0;
    private String actualOperators = "";
    public SituationSelector(){
        //create situations, and then make a int to be assigned to each situation and select 10 using a for statement to be used
        //in this to be called and given to the player to play.
        //Be sure to use other parts that will be assigned later such as Dice, Question(ask a random math question)
    }
    public String Situation1(String answer){
        int y =0;
        if (answer == "yes"){
            y = Dice();
            if (y>9){
                return "You succeeded in defending......however........";
            }
            else {
                return "Your party was unable to fend off the horde and died";
            }
        }
        else {
            return "Your party decided to fall back and end the game early because you are scared .-.";
        }
    }
    public int Dice(){
        diceValue = ((int)Math.random()*20)+1;
        return diceValue;
    }
    public String Question(){
        operators = (int)(Math.random()*4)+1;
        int values = (int)(Math.random()*10)+1;
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
        for (int i =0;i!=2;i++) {
            String theQuestion = (values + actualOperators);
            values = (int)(Math.random()*10)+1;
            theQuestion = theQuestion+values;
            return theQuestion;
        }
        return "Did you not want a question?";
    }
    public boolean Answer(int answer){
        //make a way for it to call Question, form question into an actual equation instead of a string, and find the answer
        //and if the player gets the answer correct move onto next situation
        return true;
    }
}
