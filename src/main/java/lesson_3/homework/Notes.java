package lesson_3.homework;

public class Notes extends Category {

    public Notes (String icon, String name){
        this.iconDescription = icon;
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Notes");
    }

}
