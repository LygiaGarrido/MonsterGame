public class Witch extends Supernatural implements Strikeable {
    public Witch(MonsterType type) {
        super(type, 10);
    }


    @Override
    public void defend(int damage) {
        setHealth(-damage / 2);
    }
}
