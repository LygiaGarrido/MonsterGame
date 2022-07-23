public class Player {


    private String name;
    private Monster[] monsters;
    private int amountOfCards;
    private int deadCards;


    public Player(String name, int amountOfCards) {
        this.name = name;
        this.monsters = new Monster[amountOfCards];
        generateDeck();
    }


    public Monster[] getMonsters() {
        return monsters;
    }


    public Monster pickACard() {
        int position = Random.generateRandom(0, amountOfCards - 1);
        System.out.println(monsters[position]);
        return monsters[position];


    }

    public int attack() {
        Monster card = pickACard();
        int attackPower = card.attack();
        if (attackPower == 0) {
            return 0;
        }
        return attackPower;

    }

    public void defend(int attackPower) {
        Monster card = pickACard();
        card.defend(attackPower);
        if (attackPower == 0) {
            return;
        }
        if (!card.isAlive()) {
            deadCards++;
            return;
        }

    }

    public int getDeadCards() {
        return deadCards;
    }

    public int getAmountOfCards() {
        return amountOfCards;
    }

    public String getName() {
        return name;
    }

    public void generateDeck() {

        for (int i = 0; i < this.monsters.length; i++) {

            MonsterType monster = MonsterType.values()[Random.generateRandom(0, 2)];

            switch (monster) {
                case WEREWOLF:
                    monsters[i] = new Werewolf("0");
                    break;
                case VAMPIRE:
                    monsters[i] = new Vampire("1");
                    break;
                default:
                    monsters[i] = new Mummy("2");

            }
        }
    }
}


