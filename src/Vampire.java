public class Vampire extends Monster{


    public Vampire(String type) {
        super(type);
    }

    @Override
    public int attack() {
        if(isAlive()) {
            if (Random.generateRandom(1, 5) == 1 && getHealth() <= 90) {
                setHealth(10);
                System.out.println("I've bitten you! Muahahaha!");
            }

        }
        return super.attack();
    }
}
