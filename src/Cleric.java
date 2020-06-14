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

public class Cleric extends Wizard {




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
    public void attack() {

    }

    @Override
    public void magicCast() {

    }
}
