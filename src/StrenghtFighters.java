public abstract class StrenghtFighters extends Unit {
    private int strength;

    public StrenghtFighters(String typeName, int health, int armor, int strength) {
        super(typeName, health, armor);
        this.strength = strength;
    }

    public abstract void attack();


    public int getStrength() {
        return strength;
    }

}
