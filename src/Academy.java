import java.util.Scanner;

public class Academy {
    private Scanner scanner = new Scanner(System.in);
    public String[] typeName = {"воин", "лучник", "маг", "клерик"};


    public Soldier createSoldier(String typeName) {
        int minHp = 70;
        int maxHp = 200;
        Soldier soldier = new Soldier(typeName, randomNumbers(minHp, maxHp),
                randomNumbers(100, 150), randomNumbers(100, 150));
        return soldier;
    }

    private int requestNumberOfSoldier() {

        int numberOfSoldiersInBarack;
        do {
            while (!scanner.hasNextInt()) {

                System.out.println("Вы ввели неверное значение, повторите ввод...");
                scanner.next();
            }
            numberOfSoldiersInBarack = scanner.nextInt();

        } while (numberOfSoldiersInBarack <= 0);

        return numberOfSoldiersInBarack;
    }

    public Soldier[] createSoldier() {
        System.out.println("Введите необходимое кол-во воинов в Академии");

        Soldier[] soldiersBarack = new Soldier[requestNumberOfSoldier()];

        for (int i = 0; i < soldiersBarack.length; i++) {
            soldiersBarack[i] = createSoldier(typeName[0]);
        }
        return soldiersBarack;
    }

    public Archer createArcher(String typeName) {
        int minHp = 50;
        int maxHp = 150;
        Archer archer = new Archer(typeName, randomNumbers(minHp, maxHp),
                randomNumbers(50, 100), randomNumbers(70, 130));
        return archer;
    }

    public Archer[] createArcher() {
        System.out.println("Введите необходимое кол-во лучников в Академии");

        Archer[] archersBarack = new Archer[requestNumberOfSoldier()];

        for (int i = 0; i < archersBarack.length; i++) {
            archersBarack[i] = createArcher(typeName[1]);
        }
        return archersBarack;
    }

    public Wizard createWizard(String typeName) {
        int minHp = 40;
        int maxHp = 120;
        Wizard wizard = new Wizard(typeName, randomNumbers(minHp, maxHp),
                randomNumbers(30, 50), randomNumbers(150, 200));
        return wizard;
    }

    public Wizard[] createWizard() {
        System.out.println("Введите необходимое кол-во магов в Академии");

        Wizard[] wizardsBarack = new Wizard[requestNumberOfSoldier()];

        for (int i = 0; i < wizardsBarack.length; i++) {
            wizardsBarack[i] = createWizard(typeName[2]);
        }
        return wizardsBarack;
    }

    public Cleric createCleric(String typeName) {
        int minHp = 60;
        int maxHp = 140;
        Cleric cleric = new Cleric(typeName, randomNumbers(minHp, maxHp),
                randomNumbers(60, 120), randomNumbers(150, 200));
        return cleric;
    }

    public Cleric[] createCleric() {
        System.out.println("Введите необходимое кол-во клериков в Академии");

        Cleric[] clericsBarack = new Cleric[requestNumberOfSoldier()];

        for (int i = 0; i < clericsBarack.length; i++) {
            clericsBarack[i] = createCleric(typeName[3]);
        }
        return clericsBarack;
    }

    private int randomNumbers(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
}
