public class Mummy extends Monster {

    private int numberOfAttacks;

    private final int SELF_DAMAGE = -10;

    public Mummy(String type) {
        super(type, 30);
        this.numberOfAttacks = 0;
    }

    @Override
    public int attack() {
        if(isAlive()) {
            numberOfAttacks++;
            if (numberOfAttacks == 3) {
                System.out.println("You unrolled!");
                setHealth(SELF_DAMAGE);
                numberOfAttacks = 0;
                return 0;
            }
        }

        return super.attack();
    }


}
