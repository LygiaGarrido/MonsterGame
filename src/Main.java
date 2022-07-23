import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*Monster werewolf = new Werewolf("Werewolf");
        Monster vampire = new Vampire("Vampire");
        Monster mummy = new Mummy("Mummy");
        Supernatural fairy = new Fairy("fairy");
        Supernatural witch = new Witch("witch");

        Player player = new Player("Fábio", 5);
        Player player1 = new Player("Fábio", 5);


        player.pickACard();

        player1.pickACard();
        System.out.println(player1.pickACard().getHealth());
        //System.out.println(vampire.getHealth());
        //player.attack();
        player1.defend(player.attack());
        System.out.println(player1.pickACard().getHealth());
        System.out.println(player1.getDeadCards());

         */


        Game game = new Game("player", "opponent", 5);

        game.start();
    }
}
