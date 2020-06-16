
public class Archer extends StrenghtFighters {


    public Archer(String typeName, int health, int armor, int strength) {
        super(typeName, health, armor, strength);
    }

    @Override
    public void go() {
        System.out.println("Лучник скрытно меняет позицию");
    }

    @Override
    public void stop() {
        System.out.println("Лучник затаился на месте");
    }

    @Override
    public void attack() {
        System.out.println("Лучник атакует дистанционным выстрелом");
    }
}
