public class Vampire extends Monster {


    public Vampire(MonsterType type) {
        super(type, 20);
    }

    @Override
    public int attack() {
        if (isAlive()) {
            if (Random.generateRandom(1, 5) == 1 && getHealth() <= 90) {
                setHealth(10);
                System.out.println("I've bitten you! Muahahaha!");
            }

        }
        return super.attack();
    }
}
