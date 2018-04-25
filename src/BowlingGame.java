
public class BowlingGame {

    private int[] rolls = new int[21];
    private int currentRoll;

    public int score() {
        int score = 0;
        int i = 0;
        for (int frame = 0; frame < 10; frame++) {
            int quille1 = i;
            int quille2 = i + 1;
            if (rolls[quille1] == 10) { //strike
                int quilleBonus1 = quille1 + 1;
                int quilleBonus2 = quille1 + 2;
                score += 10 + rolls[quilleBonus1] + rolls[quilleBonus2];
                i++;
            } else if (rolls[quille1] + rolls[quille2] == 10) { //spare
                int quilleBonus1 = quille2 + 1;
                score += 10 + rolls[quilleBonus1];
                i += 2;
            } else {
                score += rolls[quille1] + rolls[quille2];
                i += 2;
            }
        }
        return score;
    }

    public void roll(int numberPins) throws CoupInvalideException {
        rolls[currentRoll++] = numberPins;
    }
}
