import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        String[] store = new String[10];

        for (int j = 0; j < 100; j++) {

            System.out.println("Введите команду");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("Кладём новый товар, укажите название");
                String item = scanner.nextLine();
                for (int i = 0; i < store.length; i++) {
                    if ( store[i] == null){
                        store[i] = item;
                        System.out.println("Товар " + item + " успешно доваблен на склад");
                    break;

                }
                    else  System.out.println("Склад переполнен");

            }
            }

            if (command.equals("del")) {
                System.out.println("Что удаляем?");
                String itemToDel = scanner.nextLine();
                for (int i = 0; i < store.length; i++) {
                    if (store[i].equals(itemToDel)) {
                        store[i] = null;
                        break;
                    }
                    System.out.println("Товар " + itemToDel + " успешно удалён со склада");
                }
            }

            if (command.equals("find")) {
                System.out.println("Что ищем??");
                String findItem = scanner.nextLine();
                for (int i = 0; i < store.length; i++) {
                    if (store[i].equals(findItem)) {
                        System.out.println("Товар " + findItem + " есть на складе");
                        break;
                    }
                    else System.out.println("Товара " + findItem + " На складе нет");
                }
            }

            if (command.equals("count")) {
                int count = 0;
                for (int i = 0; i < store.length; i++) {
                    if (store[i] != null) {
                        count = count+1;
                    }

                }
                System.out.println("На складе " + count + " позиций");
            }


            for (int i = 0; i < store.length; i++) {
//                if (store[i] != null) {
                    System.out.println("На складе " + store[i]);
                }
            }
        }
    }




