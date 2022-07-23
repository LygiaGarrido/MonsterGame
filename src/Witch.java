public class Witch extends Supernatural implements Strikeable{
    public Witch(String type) {
        super(type);
    }


    @Override
    public void defend(int damage) {
        setHealth(-damage/2);
    }
}
