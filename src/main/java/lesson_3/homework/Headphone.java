package lesson_3.homework;

public class Headphone extends Category {

    public Headphone (String icon, String name){
        this.iconDescription = icon;
        this.name = name;
    }
    @Override
    public void open() {
        System.out.println("HeadPhones");
    }

}