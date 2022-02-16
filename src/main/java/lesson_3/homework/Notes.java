package lesson_3.homework;

public class Notes extends Category {

    public void iconDescriptionSet() {
        iconDescription = "Note";
    }

    public void nameSet() {
        name = "someNote";
    }

    @Override
    public void open() {
        System.out.println("Notes");
    }

}
