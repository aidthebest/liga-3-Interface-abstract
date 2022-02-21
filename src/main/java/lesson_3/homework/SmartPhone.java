package lesson_3.homework;

public class SmartPhone extends Category {

    public SmartPhone (String icon, String name){
        this.iconDescription = icon;
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Phones");
    }
}
