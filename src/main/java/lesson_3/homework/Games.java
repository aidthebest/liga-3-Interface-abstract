package lesson_3.homework;

public class Games extends Category {

    public Games (String icon, String name){
        this.iconDescription = icon;
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Games");
    }

}
