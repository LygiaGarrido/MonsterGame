import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Monster werewolf = new Werewolf("Werewolf");
        Monster vampire = new Vampire("Vampire");
        Monster mummy = new Mummy("Mummy");
        Supernatural fairy = new Fairy("fairy");
        Supernatural witch = new Witch("witch");
        Player player = new Player("Fábio", 5);

        player.generateDeck();
        //System.out.println(Arrays.toString(player.getDeck()));
        player.pickACard();

        player.attack();

        /*((Witch)witch).defend(10);
        System.out.println((witch.getHealth()));

         */

        /*witch.defend(10);
        System.out.println(witch.getHealth());*/

       /* mummy.attack();
        mummy.attack();
        mummy.attack();
        System.out.println(mummy.getHealth());
        mummy.attack();

        */

        /*fairy.setHealth(-10);
        System.out.println(fairy.getHealth());

         */












    }
}
