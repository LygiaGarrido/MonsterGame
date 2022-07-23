public class Player {


    private String name;
    private Monster[] deck;
    private int amountOfCards;
    private int deadCards;


    public Player(String name, int amountOfCards) {
        this.name = name;
        this.deck = new Monster[amountOfCards];
    }


    public void generateDeck() {
        for (int i = 0; i < this.deck.length; i++) {

            MonsterType monster = MonsterType.values()[Random.generateRandom(0, 2)];

            switch (monster) {
                case WEREWOLF:
                    deck[i] = new Werewolf("0");
                    return;
                case VAMPIRE:
                    deck[i] = new Vampire("1");
                    return;
                default: deck[i] = new Mummy("2");
            }


        }


    }
}

