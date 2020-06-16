
public abstract class Unit {
    private String typeName;
    private int health;
    private int armor;


    public Unit(String typeName, int health, int armor) {
        this.typeName = typeName;
        this.health = health;
        this.armor = armor;
    }

    public abstract void go();

    public abstract void stop();


    public int getHealth() {
        return health;
    }


    public int getArmor() {
        return armor;
    }

    public String getTypeName() {
        return typeName;
    }


}
