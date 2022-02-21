package lesson_3.homework;

public class HomeApp extends Category {

    public HomeApp (String icon, String name){
        this.iconDescription = icon;
        this.name = name;
    }
    @Override
    public void open() {
        System.out.println("Apps");
    }

}