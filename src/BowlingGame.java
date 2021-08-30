
import java.util.*;


public class BowlingGame {

    HashMap<String, Integer> players = new HashMap<String, Integer>();


    public void addPlayer(String name, int p) {

        players.put(name, p);
    }

    public void getWinner() {

        try {
            System.out.println(players.entrySet()
                    .stream()
                    //two parameters here for maximum value (name,point)
                    //booleanExpression (name and point) ? expression1 (if) : expression2(else)
                    //if name.getValue() is greater than point.getValue() return 1 name else return -1
                    .max((name, point) -> name.getValue() > point.getValue() ? 1 : -1)
                    .get().getKey());
        } catch (IllegalStateException exception) {
            System.out.println("Something is wrong here");
        }
    }


    public class Program {
        public static void main(String[] args) {
            BowlingGame game = new BowlingGame();
            Scanner input = new Scanner(System.in);



            try {

                for (int i = 0; i < 3; i++) {

                    //String = "Java is cool innit"
                    String x = input.nextLine();

                    //Use split to check
                    String[] value = x.split(" ");

                    //String name = spaces on zero index e.g Amy as zero index followed by spaces
                    String name = value[0];

                    //Int points = parse the String to Integer.Checks index 1. e.g as Amy is zero index,a
                    //after the space, int value would be as index 1 e.g 100
                    int points = Integer.parseInt(value[1]);


                    //add the players for the name and their points
                    game.addPlayer(name, points);

                }
                game.getWinner();

            } catch (NumberFormatException exception) {
                System.out.println("Please enter valid values");
            }
        }
    }
}