package lesson_3.homework;

public class SmartPhone extends Category {

    public void iconDescriptionSet() {
        iconDescription = "Phones";
    }

    public void nameSet() {
        name = "somePhone";
    }

    @Override
    public void open() {
        System.out.println("Phones");
    }
}
