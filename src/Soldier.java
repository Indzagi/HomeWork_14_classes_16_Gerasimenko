
public class Soldier extends StrenghtFighters {


    public Soldier(String typeName, int health, int armor, int strength) {
        super(typeName, health, armor, strength);

    }

    @Override
    public void go() {
        System.out.println("Воин быстро двигается вперед");
    }

    @Override
    public void stop() {
        System.out.println("Воин резко останавливается");
    }

    @Override
    public void attack() {
        System.out.println("Воин молниеносно атакует");
    }


}
