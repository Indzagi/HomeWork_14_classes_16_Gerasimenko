
public class Cleric extends MagicFighters {


    public Cleric(String typeName, int health, int armor, int magicPower) {
        super(typeName, health, armor, magicPower);
    }

    public void casteTreatment() {
        System.out.println("Клерик кастует лечение на выбраную цель");
    }

    @Override
    public void go() {
        System.out.println("Клерик двигается с помощью воздушного облака");
    }

    @Override
    public void stop() {
        System.out.println("Клерик постепенно отсанавливается");
    }

    @Override
    public void magicCast() {
        System.out.println("Клерик атакует сгустком чистой, положительной энергии");
    }
}
