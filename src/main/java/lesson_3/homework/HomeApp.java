package lesson_3.homework;

public class HomeApp extends Category {

    public void iconDescriptionSet() {
        iconDescription = "HomeApp";
    }

    public void nameSet() {
        name = "someApp";
    }

    @Override
    public void open() {
        System.out.println("Apps");
    }

}