public class Main {
    public static void main(String[] args) {
        displayHighscorePos("Artyom", 1500);
        displayHighscorePos("David", 900);
        displayHighscorePos("Nik", 400);
        displayHighscorePos("Jay", 50);
    }

    // My way of answering
    public static int calculateHighscorePos(int score){
        int highscorePos;

        if(score >= 1000){
            highscorePos = 1;
        } else if(score >= 500) {
            highscorePos = 2;
        } else if(score >= 100) {
            highscorePos = 3;
        } else {
            highscorePos = 4;
        }
        return highscorePos;
    }

    public static void displayHighscorePos(String name, int score){
        System.out.println(name + " got into position #" + calculateHighscorePos(score) + " on the high-score table");
    }

    /* *** Course Answer***
        public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 2;
        }
        else if(playerScore >= 500) {
            return 2;
        }
        else if(playerScore >= 100) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        int highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", highScorePosition);

        int highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Dom", highScorePosition);

        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Lom", highScorePosition);
    }
    */
}