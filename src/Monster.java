public abstract class Monster extends Supernatural implements Strikeable {


    public Monster(String type) {

        super(type);
    }



    @Override
    public void defend(int damage) {

        if(isAlive()){
            setHealth(-damage) ;
            return;

        }

    }
}

