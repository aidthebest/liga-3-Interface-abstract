package lesson_3.homework;

public class Pc extends Category {

    public Pc (String icon, String name){
        this.iconDescription = icon;
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("PCs");
    }
}
