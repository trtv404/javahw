import java.util.*;
import java.lang.String;
import java.util.Arrays;

public class hw4 {
    public static void main(String[] args) {
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести
// в консоль в формате "Иванов И.И. 32 М"}
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();

        while (scanner.hasNext()) {
            list1.add(scanner.nextLine());
        }
        System.out.println(list1);
        System.out.println("-------вывод для второго задания-------");
        String[] st = new String[5];
        for (String i : list1) {
            st = i.split(" ");
            System.out.println(st[0] + " " + st[1].toUpperCase().charAt(0) + "."+st[2].toUpperCase().charAt(0) + ". " + st[3] + " " + st[4].toUpperCase());
        }
        System.out.println("-------конец второго задания-------");

// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества,
// возрас и пол в отдельных списках.

        int id = 0;
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<String> list_f = new ArrayList<>();
        ArrayList<String> list_i = new ArrayList<>();
        ArrayList<String> list_o = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        ArrayList<String> list_gender = new ArrayList<>();
        String[] st1 = new String[5];
        for (String i : list1) {
            st1 = i.split(" ");
            index.add(id);
            list_f.add(st1[0]);
            list_i.add(st1[1]);
            list_o.add(st1[2]);
            list_age.add(Integer.parseInt(st1[3]));
            list_gender.add(st1[4]);
            id++;
        }
        System.out.println("-------вывод для третьего задания, проверка отдельных списков-------");
        System.out.println(list_f);
        System.out.println(list_i);
        System.out.println(list_o);
        System.out.println(list_age);
        System.out.println(list_gender);
        System.out.println("-------конец третьего задания-------");

// 4.Отсортировать по возрасту используя дополнительный список индексов.

        System.out.println("------- четвертое задание -------");
        ArrayList<Integer> age_copy = new ArrayList<>();
        age_copy.addAll(list_age); // чтобы не испортить "начальный" список возрастов
        int temp = 0;
        for (int k = 0; k < age_copy.size()-1; k++) {
            for (int j = 0; j < age_copy.size() - 1; j++) {
                if (age_copy.get(j) >= age_copy.get(j + 1)) {
                    temp = age_copy.get(j);
                    age_copy.set(j, age_copy.get(j + 1));
                    age_copy.set(j + 1, temp);
                    temp = index.get(j);
                    index.set(j, index.get(j + 1));
                    index.set(j + 1, temp);
                }
            }
        }
        for (int i: index) {
            System.out.println(list1.get(i));
        }
    }
}








