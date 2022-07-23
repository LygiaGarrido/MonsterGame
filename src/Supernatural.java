import java.util.Arrays;

public abstract class Supernatural {

    private int health;
    private MonsterType type;
    private int damage;
    private boolean isAlive;

    public Supernatural(MonsterType type, int damage) {
        this.health = 100;
        this.isAlive = true;
        this.type = type;
        this.damage = damage;

    }


    public int attack() {
        if (isAlive) {
            //System.out.println("Attacking with: " + this.damage);
            return this.damage;
        }
        return 0;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public MonsterType getType() {
        return type;
    }
}


