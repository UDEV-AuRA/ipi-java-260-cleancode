import java.util.Scanner;

public class BowlingConsole {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        BowlingGame bowlingGame = new BowlingGame();


        while (bowlingGame.isFinish()) {
            System.out.println("Vous en êtes à l'étape " + bowlingGame.status());

            System.out.println("Combien de quille vous avez fait tombé ?");
            String nbQuillesAsString = scanner.nextLine();
            int nbQuilles = Integer.parseInt(nbQuillesAsString);
            bowlingGame.roll(nbQuilles);

            int score = bowlingGame.score();
            System.out.println("Votre score est de : " + score);
            System.out.println("-----------------");
        }
        System.out.println("Le jeu est terminé. Votre score final est " + bowlingGame.score());

    }
}
