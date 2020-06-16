public abstract class StrenghtFighters extends Unit {
    private int strength;

    public abstract void attack();


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
