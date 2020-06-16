
public class Wizard extends MagicFighters {

    public Wizard(String typeName, int health, int armor, int magicPower) {
        this.setTypeName(typeName);
        this.setHealth(health);
        this.setArmor(armor);
        this.setMagicPower(magicPower);
    }


    @Override
    public void go() {
        System.out.println("Маг двигается с помощью телепорта по координатам");
    }

    @Override
    public void stop() {
        System.out.println("Маг стоит");
    }


    public void attack() {
        System.out.println("Маг атакует стандартным заклинанием Magic Missile");
    }


    @Override
    public void magicCast() {
        System.out.println("Маг атакует специальным заклинанием Fire Boll");
    }
}
