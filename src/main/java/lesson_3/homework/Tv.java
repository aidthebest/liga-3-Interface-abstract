package lesson_3.homework;

public class Tv extends Category {

    public void iconDescriptionSet() {
        iconDescription = "TV";
    }

    public void nameSet() {
        name = "someTV";
    }

    @Override
    public void open() {
        System.out.println("TVs");
    }

}
