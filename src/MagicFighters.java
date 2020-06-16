public abstract class MagicFighters extends Unit {
    private int magicPower;

    public MagicFighters(String typeName, int health, int armor, int magicPower) {
        super(typeName, health, armor);
        this.magicPower = magicPower;
    }

    public abstract void magicCast();


    public int getMagicPower() {
        return magicPower;
    }

}
