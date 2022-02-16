package lesson_3.homework;

public class Games extends Category {

    public void iconDescriptionSet() {
        iconDescription = "Game";
    }

    public void nameSet() {
        name = "someGame";
    }

    @Override
    public void open() {
        System.out.println("Games");
    }

}
