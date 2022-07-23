public abstract class Monster extends Supernatural implements Strikeable {


    public Monster(String type, int damage) {

        super(type, damage);
    }



    @Override
    public void defend(int damage) {

        if(isAlive()){
            setHealth(-damage);

        } if (getHealth()<=0){
            setAlive(false);
            setHealth(0);
        }
    }
}

