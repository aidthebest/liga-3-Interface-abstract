package lesson_3.homework;

public class ElectronicsElement extends Category {

    @Override
    public void open() {
        //click electronics
        System.out.println("Выберите элемент категории"); //для понимания логики использования абстрактного класса и интерфейса
    }

    public String getType() {
        return "electroElsTab";
    }
}
