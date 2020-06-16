import java.util.Scanner;

public class Academy {
    private Soldier[] soldiersBarack;
    private Archer[] archersBarack;
    private Wizard[] wizardsBarack;
    private Cleric[] clericsBarack;
    private Scanner scanner = new Scanner(System.in);
    private String[] typeName = {"воин", "лучник", "маг", "клерик"};

    public void academyMain() {

        hello();

        boolean tempBool = true;

        while (tempBool) {

            System.out.println("Барак с каким типом бойцев вы хотите создать?...");

            Scanner scanner = new Scanner(System.in);
            String typeNameToRequest = scanner.nextLine();


            for (int i = 0; i < typeName.length; i++) {

                if (typeNameToRequest.equals(typeName[i])) {

                    break;

                } else if (i + 1 == typeName.length) {

                    System.out.println("Вы ввели неправильные данные, повторите " +
                            "ввод типа бойца или закончите запрос" +
                            " на создание с помощью команды \"стоп\"...");
                    tempBool = true;
                }
            }


            if (typeNameToRequest.equals(typeName[0]) && soldiersBarack == null) {

                soldiersBarack = createSoldier();
                printCharactersOfSoldier();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals(typeName[1]) && archersBarack == null) {

                archersBarack = createArcher();
                printCharactersOfArcher();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals(typeName[2]) && wizardsBarack == null) {

                wizardsBarack = createWizard();
                printCharactersOfWizard();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals(typeName[3]) && clericsBarack == null) {

                clericsBarack = createCleric();
                printCharactersOfCleric();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals("стоп") || typeNameToRequest.equals("Стоп")) {

                tempBool = false;

            } else if (typeNameToRequest.equals(typeName[0]) &&
                    soldiersBarack != null) {

                System.out.println("Барак с воинами уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            } else if (typeNameToRequest.equals(typeName[1]) &&
                    archersBarack != null) {

                System.out.println("Барак с лучниками уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            } else if (typeNameToRequest.equals(typeName[2]) &&
                    wizardsBarack != null) {

                System.out.println("Барак с магами уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            } else if (typeNameToRequest.equals(typeName[3]) &&
                    clericsBarack != null) {

                System.out.println("Барак с клериками уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            }
        }
    }

    private void hello() {
        System.out.println("Добрый день, Вас преветствует Академия по созданию бойцов " +
                "различных классов!");

        System.out.println(String.format("%nПредлагается создать барак с бойцами определенного класса," +
                " для создания %nбарака воинов - введите \"%s\" и кол-во " +
                "бойцов, которое хотите создать,%nдля барака лучников - \"%s\"," +
                " маги - \"%s\", клерики \"%s\",%nчтобы окончить подговоку бойцов," +
                " напишите \"стоп\"%n", typeName[0], typeName[1], typeName[2], typeName[3]));
    }

    private boolean requestYesOrNo() {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Хотите еще создать барак с бойцами другого типа?");
        boolean tempBool2 = true;
        boolean tempBool = true;

        while (tempBool2) {

            String requestYesOrNo = scanner1.nextLine();

            if (requestYesOrNo.equals("Да") || requestYesOrNo.equals("да")) {

                tempBool2 = false;

                return true;

            } else if (requestYesOrNo.equals("Нет") || requestYesOrNo.equals("нет")) {


                tempBool2 = false;

                return false;

            } else {

                System.out.println("вы ввели неправильное значение, повторите ввод");
                tempBool2 = true;
            }
        }
        return tempBool;
    }

    private void printCharactersOfSoldier() {
        for (int i = 0; i < soldiersBarack.length; i++) {
            System.out.println(String.format("создан %s №%d со здоровьем %d, защитой %d, силой %d",
                    soldiersBarack[i].getTypeName(), i + 1, soldiersBarack[i].getHealth(),
                    soldiersBarack[i].getArmor(), soldiersBarack[i].getStrength()));
        }
    }

    private void printCharactersOfArcher() {
        for (int i = 0; i < archersBarack.length; i++) {
            System.out.println(String.format("создан %s №%d со здоровьем %d, защитой %d, силой %d",
                    archersBarack[i].getTypeName(), i + 1, archersBarack[i].getHealth(),
                    archersBarack[i].getArmor(), archersBarack[i].getStrength()));
        }
    }

    private void printCharactersOfWizard() {
        for (int i = 0; i < wizardsBarack.length; i++) {
            System.out.println(String.format("создан %s №%d со здоровьем %d, защитой %d, силой магии %d",
                    wizardsBarack[i].getTypeName(), i + 1, wizardsBarack[i].getHealth(),
                    wizardsBarack[i].getArmor(), wizardsBarack[i].getMagicPower()));
        }
    }

    private void printCharactersOfCleric() {
        for (int i = 0; i < clericsBarack.length; i++) {
            System.out.println(String.format("создан %s №%d со здоровьем %d, защитой %d, силой магии %d",
                    clericsBarack[i].getTypeName(), i + 1, clericsBarack[i].getHealth(),
                    clericsBarack[i].getArmor(), clericsBarack[i].getMagicPower()));
        }
    }

    private Soldier createSoldier(String typeName) {
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

    private Soldier[] createSoldier() {
        System.out.println("Введите необходимое кол-во воинов в Академии");

        soldiersBarack = new Soldier[requestNumberOfSoldier()];

        for (int i = 0; i < soldiersBarack.length; i++) {
            soldiersBarack[i] = createSoldier(typeName[0]);
        }
        return soldiersBarack;
    }

    private Archer createArcher(String typeName) {
        int minHp = 50;
        int maxHp = 150;
        Archer archer = new Archer(typeName, randomNumbers(minHp, maxHp),
                randomNumbers(50, 100), randomNumbers(70, 130));
        return archer;
    }

    private Archer[] createArcher() {
        System.out.println("Введите необходимое кол-во лучников в Академии");

        archersBarack = new Archer[requestNumberOfSoldier()];

        for (int i = 0; i < archersBarack.length; i++) {
            archersBarack[i] = createArcher(typeName[1]);
        }
        return archersBarack;
    }

    private Wizard createWizard(String typeName) {
        int minHp = 40;
        int maxHp = 120;
        Wizard wizard = new Wizard(typeName, randomNumbers(minHp, maxHp),
                randomNumbers(30, 50), randomNumbers(150, 200));
        return wizard;
    }

    private Wizard[] createWizard() {
        System.out.println("Введите необходимое кол-во магов в Академии");

        wizardsBarack = new Wizard[requestNumberOfSoldier()];

        for (int i = 0; i < wizardsBarack.length; i++) {
            wizardsBarack[i] = createWizard(typeName[2]);
        }
        return wizardsBarack;
    }

    private Cleric createCleric(String typeName) {
        int minHp = 60;
        int maxHp = 140;
        Cleric cleric = new Cleric(typeName, randomNumbers(minHp, maxHp),
                randomNumbers(60, 120), randomNumbers(150, 200));
        return cleric;
    }

    private Cleric[] createCleric() {
        System.out.println("Введите необходимое кол-во клериков в Академии");

        clericsBarack = new Cleric[requestNumberOfSoldier()];

        for (int i = 0; i < clericsBarack.length; i++) {
            clericsBarack[i] = createCleric(typeName[3]);
        }
        return clericsBarack;
    }

    private int randomNumbers(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
}
