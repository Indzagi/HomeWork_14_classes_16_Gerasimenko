import java.util.Scanner;

public class ArmyCamp {
    public Soldier[] soldiersBarack;
    public Archer[] archersBarack;
    public Wizard[] wizardsBarack;
    public Cleric[] clericsBarack;

    public void armyCreation(Academy academy) {

        boolean tempBool = true;

        while (tempBool) {

            System.out.println("Барак с каким типом бойцев вы хотите создать?...");

            Scanner scanner = new Scanner(System.in);
            String typeNameToRequest = scanner.nextLine();


            for (int i = 0; i < academy.typeName.length; i++) {

                if (typeNameToRequest.equals(academy.typeName[i])) {

                    break;

                } else if (i + 1 == academy.typeName.length) {

                    System.out.println("Вы ввели неправильные данные, повторите " +
                            "ввод типа бойца или закончите запрос" +
                            " на создание с помощью команды \"стоп\"...");
                    tempBool = true;
                }
            }


            if (typeNameToRequest.equals(academy.typeName[0]) && soldiersBarack == null) {

                soldiersBarack = academy.createSoldier();
                printCharactersOfSoldier();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals(academy.typeName[1]) && archersBarack == null) {

                archersBarack = academy.createArcher();
                printCharactersOfArcher();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals(academy.typeName[2]) && wizardsBarack == null) {

                wizardsBarack = academy.createWizard();
                printCharactersOfWizard();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals(academy.typeName[3]) && clericsBarack == null) {

                clericsBarack = academy.createCleric();
                printCharactersOfCleric();

                tempBool = requestYesOrNo();

            } else if (typeNameToRequest.equals("стоп") || typeNameToRequest.equals("Стоп")) {

                tempBool = false;

            } else if (typeNameToRequest.equals(academy.typeName[0]) &&
                    soldiersBarack != null) {

                System.out.println("Барак с воинами уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            } else if (typeNameToRequest.equals(academy.typeName[1]) &&
                    archersBarack != null) {

                System.out.println("Барак с лучниками уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            } else if (typeNameToRequest.equals(academy.typeName[2]) &&
                    wizardsBarack != null) {

                System.out.println("Барак с магами уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            } else if (typeNameToRequest.equals(academy.typeName[3]) &&
                    clericsBarack != null) {

                System.out.println("Барак с клериками уже создан," +
                        " смените тип запрашиваемого класса...");
                tempBool = true;

            }
        }
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

}
