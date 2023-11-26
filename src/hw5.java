import java.util.HashMap;

public class hw5 {
    public static void main(String[] args) {
//Создать множество, ключ и значение строки. Добавить шесть элементов.
        HashMap<String, String> map_1 = new HashMap<>();
        map_1.put("Один", "Первый");
        map_1.put("Два", "Второй");
        map_1.put("Три", "Третий");
        map_1.put("Четыре", "Четвертый");
        map_1.put("Пять", "Пятый");
        map_1.put("Шесть", "Шестой");
// Вывести в консоль значения.
        map_1.keySet();
        for (String key: map_1.keySet()) {
            System.out.println(map_1.get(key));
        }
        System.out.println("------------");
// Добавить ко всем значениям символ "!".
        for (String key: map_1.keySet()) {
            map_1.merge(key, "!", String::concat);
        }
        System.out.println(map_1);
        System.out.println("------------");

//Создать второе множество с таким же обобщением.
// Ключи второго множества частично совпадают с ключеми первого.
        HashMap<String, String> map_2 = new HashMap<>();
        map_2.put("Два", "2");
        map_2.put("Четыре", "4");
        map_2.put("Шесть", "6");
        map_2.put("Восемь", "8");
        map_2.put("Десять", "10");
        System.out.println(map_2);
        System.out.println("------------");

// Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.
        map_2.keySet();
            for (String key: map_2.keySet()) {
                if (map_1.containsKey(key)) {
                    map_2.computeIfPresent(key, (k,v) -> {
                    v+=map_1.get(key);
                    return v;
                });
            }
        }
        System.out.println(map_2);
    }


}
