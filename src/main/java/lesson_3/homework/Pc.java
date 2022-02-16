package lesson_3.homework;

public class Pc extends Category {

    public void iconDescriptionSet() {
        iconDescription = "PCs";
    }

    public void nameSet() {
        name = "somePc";
    }

    @Override
    public void open() {
        System.out.println("PCs");
    }
}
