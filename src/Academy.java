import java.util.Scanner;

/**
 * 1. Создать абстрактный класс Unit
 * a. Обладает состоянием (свойства\характеристики): Здоровье, Защита
 * b. Обладает абстрактным поведением (методы): ходить, останавливаться, атаковать
 * <p>
 * 2. Создать классы Soldier, Archer, Wizard
 * a. Каждый должен наследовать состояние родителя Unit: Здоровье, Защита
 * b. Soldier, Archer должны обладать свойством “Сила”, а Wizard - “Магическая Сила”
 * c. Каждый наследует поведение родителя Unit и переопределяет его под себя:
 * ходить, останавливаться, атаковать
 * d. Для класса Wizard создать дополнительный метод творить магию
 * <p>
 * 3. Создать класс Cleric
 * a. Наследует поведение и состояние класса Wizard и переопределяемых их под себя
 * b. Обладает поведением “Лечить”
 * 4. Создать класс Academy
 * a. Обладает поведением (методы): Создать воина,
 * Создать лучника, Создать мага, Создать клерика
 * <p>
 * 5. Класс Academy должен обладать возможностью заказать подготовку юнитов
 * в предопределенном количестве и вернуть сразу группу, вместо одного.
 * При этом старые методы остаются, но имена старых и новых должны быть одинаковыми
 * <p>
 * 6.** Soldier и Archer должны иметь общего родителя, который наследуем им состояние
 * (свойства\характеристики) - “Сила”, при этом допускается использование в
 * качестве предка (прародители, прапрародители и так далее) Unit, но он не может быть непосредственным родителем
 * <p>
 * 7.** Класс Cleric не должен обладать поведением “Атаковать”,
 * но при это должен обладать всем остальным состоянием и поведением класса Wizard.
 * Допускается создание других классов и изменение текущей структуры класса Wizard,
 * без потери его текущего состояния (свойства\характеристики) и поведения (методы)
 */

public class Academy {
    private Soldier[] soldiersBarack;
    private Archer[] archersBarack;
    private Wizard[] wizardsBarack;
    private Cleric[] clericsBarack;
    private Scanner scanner = new Scanner(System.in);

    public void academyMain() {

    }


    private Soldier[] createSoldier(Soldier soldier) {
        System.out.println("Введите необходимое кол-во воинов в Академии");
        soldiersBarack = new Soldier[scanner.nextInt()];

        for (int i = 0; i < soldiersBarack.length; i++) {
            soldier = new Soldier();
            soldiersBarack[i] = soldier;

        }
        return soldiersBarack;
    }

    private void createArcher(Archer archer) {

    }

    private void createWizard(Wizard wizard) {

    }

    private void createCleric(Cleric cleric) {

    }

}
