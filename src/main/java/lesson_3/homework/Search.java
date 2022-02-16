package lesson_3.homework;

public class Search extends Category {
    @Override
    public void open() {
        //enter text
        //click search
        System.out.println("Вы искали + textResult");
    }

    public String getType() {
        return "searchTab";
    }
}
