public class Game {

    Player player;

    Player opponent;

    private int amountOfCards;
    private boolean gameEnded;

    public Game(String player, String opponent, int amountOfCards) {
        this.player = new Player(player, amountOfCards);
        this.opponent = new Player(opponent, amountOfCards);
        this.amountOfCards = amountOfCards;

    }


    public void start() {

        player.defend(opponent.attack());
        if (gameEnded(player, opponent)) {
            return;
        }


        opponent.defend(player.attack());
        if (gameEnded(player, opponent)) {
            return;
        }
        start();
    }

    public boolean gameEnded(Player player, Player opponent) {

        if (player.getDeadCards() == player.getAmountOfCards()) {
            System.out.println(opponent.getName() + " Won!");
            return true;

        }
        if (opponent.getDeadCards() == opponent.getAmountOfCards()) {
            System.out.println(player.getName() + " Won!");
            return true;


        }
        return false;
    }
}
