package lesson_3.homework;

public class Headphone extends Category {

    public void iconDescriptionSet() {
        iconDescription = "Headphone";
    }

    public void nameSet() {
        name = "someHeadPhone";
    }

    @Override
    public void open() {
        System.out.println("HeadPhones");
    }

}