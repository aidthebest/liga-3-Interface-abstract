package lesson_6;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tests {
    public static void main(String[] args) {
        System.out.println();
    }

    /**
     * Получить List чисел в виде текстовых элементов
     */
    @Test
    public void test_1() {
        List<Integer> integerList = getIntList();
        String f = integerList.toString();
        System.out.println(f);
    }

    /**
     * Отсортировать список по убыванию
     */

    @Test
    public void test_2() {
        List<Integer> integerList = getIntList();
        integerList.sort(Comparator.reverseOrder());
        System.out.println(integerList);
    }

    /**
     * Получить одну строку текста. Каждый элемент должен начинаться с текста "Number - ".
     * Элементы должны разделяться запятой и пробелом.
     * В начале итоговой строки должен быть текст "Number list: "
     * В конце итоговой строки должен быть текст "end of list.".
     */
    @Test
    public void test_3() {
        List<String> stringList = getStringList();
        System.out.println(stringList.stream().collect(Collectors.joining(", Number - ", "Number list: Number - ", ", end of List.")));
    }

    /**
     * Получить мапу со значениями, ключи которых больше трех и меньше девяти
     */
    @Test
    public void test_4() {
        Map<Integer, String> map = getMap();
        System.out.println(map.entrySet().stream().filter(x->x.getKey()>3).filter(x->x.getKey()<9).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    /**
     * Перемешать все элементы в мапе.
     * Пример результата:
     * Элемент 1: ключ - 5, значение "five"
     * Элемент 2: ключ - 7, значение "seven"
     * Элемент 3: ключ - 2, значение "two"
     * и так далее.
     */
    @Test
    public void test_5() {
        Map<Integer, String> map = getMap();

        List keys = new ArrayList(map.keySet());
        Collections.shuffle(keys);
        for (Object o : keys) {
            map.get(o);
        }

        System.out.println(keys);
    }

    /**
     * Установить во всех элементах isDisplayed = true, и оставить в списке только элементы с value NULL.
     */
    @Test
    public void test_6() {
        List<WebElement> elements = getElements();
        System.out.println(elements.stream().filter(x -> (x.isDisplayed())).filter(x->x.getValue()==null).toList());
    }

    /**
     * Инвертировать isDisplayed параметр каждого элемента и отсортировать список по типу элемента
     * со следующим приоритетом:
     * 1. TEXT
     * 2. INPUT_FIELD
     * 3. CHECKBOX
     * 4. BUTTON
     * 5. RADIO_BUTTON
     * 6. IMAGE
     */
    @Test
    public void test_7() {
        List<WebElement> elements = getElements();
        List<WebElement> text = elements.stream().filter(x->x.getType().equals(Type.TEXT)).toList();
        List<WebElement> input = elements.stream().filter(x->x.getType().equals(Type.INPUT_FIELD)).toList();
        List<WebElement> check = elements.stream().filter(x->x.getType().equals(Type.CHECKBOX)).toList();
        List<WebElement> but = elements.stream().filter(x->x.getType().equals(Type.BUTTON)).toList();
        List<WebElement> rbut = elements.stream().filter(x->x.getType().equals(Type.RADIO_BUTTON)).toList();
        List<WebElement> image = elements.stream().filter(x->x.getType().equals(Type.IMAGE)).toList();

        List<WebElement> totalList = Stream.concat(text.stream(), input.stream()).toList();
        List<WebElement> totalList2 = Stream.concat(totalList.stream(), check.stream()).toList();
        List<WebElement> totalList3 = Stream.concat(totalList2.stream(), but.stream()).toList();
        List<WebElement> totalList4 = Stream.concat(totalList3.stream(), rbut.stream()).toList();
        List<WebElement> totalList5 = Stream.concat(totalList4.stream(), image.stream()).toList();

        System.out.println(totalList5.stream().peek(x->x.setDisplayed(false)).toList());
//        System.out.println(text);
//        System.out.println(input);
//        System.out.println(check);
//        System.out.println(but);
//        System.out.println(rbut);
//        System.out.println(image);
//
//        System.out.println(totalList5);

//        sorted((x, y)-> x.getType().compareTo(y.getType())).toList();
    }

    /**
     * Создать мапу:
     * ключ - текст
     * значение - тип элемента
     */
    public void test_8() {
        List<WebElement> elements = getElements();
    }

    /**
     * Получить список элементов, у которых текст или значение оканчивается на число от 500 и более.
     * И отсортировать по увеличению сначала элементы с текстом, а затем по убыванию элементы со значением.
     */
    public void test_9() {
        List<WebElement> elements = getElements();
    }

    public static Map<Integer, String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        return map;
    }

    public static List<String> getStringList() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("one");
        list.add("nine");
        list.add("ten");
        return list;
    }

    public static List<Integer> getIntList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }

    public static List<WebElement> getElements() {
        List<WebElement> result = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            result.add(new WebElement());
        }
        return result;
    }
}
