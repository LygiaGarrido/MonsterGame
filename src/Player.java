public class Player {


    private String name;
    private Monster[] deck;
    private int amountOfCards;
    private int deadCards;



    public Player(String name, int amountOfCards) {
        this.name = name;
        this.deck = new Monster[amountOfCards];
    }


    public Monster[] getDeck() {
        return deck;
    }


    public Monster pickACard(){
        int position = Random.generateRandom(0, amountOfCards-1);
        //System.out.println(deck[position]);
        return deck[position];

    }

    public void attack(){
        Monster card = pickACard();
        card.attack();

    }



    public void generateDeck() {

        for (int i = 0; i < this.deck.length; i++) {

            MonsterType monster = MonsterType.values()[Random.generateRandom(0, 2)];

            switch (monster) {
                case WEREWOLF:
                    deck[i] = new Werewolf("0");
                    break;
                case VAMPIRE:
                    deck[i] = new Vampire("1");
                    break;
                default:
                    deck[i] = new Mummy("2");

            }
        }
    }
}


