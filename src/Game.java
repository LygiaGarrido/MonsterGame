public class Game {

    Player player;

    Player opponent;

    private Supernatural[] obstacles = new Supernatural[2];
    private int amountOfCards;
    private boolean gameEnded;

    public Game(String player, String opponent, int amountOfCards) {
        this.player = new Player(player, amountOfCards);
        this.opponent = new Player(opponent, amountOfCards);
        this.amountOfCards = amountOfCards;
        generateGameObstacle();

    }


    public void start() {
        if (!gameEnded) {
            if (Random.generateRandom(1, 5) == 1) {
                startObstacle();
            }

        }

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


    public void generateGameObstacle() {

        obstacles[0] = new Witch(MonsterType.WITCH);
        obstacles[1] = new Fairy(MonsterType.FAIRY);

    }

    public Supernatural pickObstacle() {
        int position = Random.generateRandom(0, 1);
        System.out.println("You picked a " + obstacles[position].getType());
        return obstacles[position];
    }

    public void startObstacle() {
        player.defend(obstacleAttack());
        opponent.defend(obstacleAttack());
        if (gameEnded(player, opponent)) {
            return;
        }

        obstacleDefend(player.attack());
        obstacleDefend(opponent.attack());

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


    public int obstacleAttack() {
        Supernatural card = pickObstacle();
        int attackPower = card.attack();

        return attackPower;

    }

    public void obstacleDefend(int attackPower) {
        Witch card = (Witch) obstacles[0];
        card.defend(attackPower);
        System.out.println("defending att with " + attackPower);


    }


}
