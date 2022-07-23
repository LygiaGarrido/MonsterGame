public abstract class Supernatural {

    private int health;
    private String type;
    private int damage;
    private boolean isAlive;

    public Supernatural(String type) {
        this.health = 100;
        this.isAlive = true;
        this.type = type;

    }


    public int attack() {
        if (isAlive) {
            System.out.println("Attacking with: " + this.damage);
            return this.damage;
        }
        return 0;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }
}

