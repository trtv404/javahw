/*
1. Реализовать алгоритм обратной сортировки списков компаратором.
2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
6. Повторить пятый пункт но с LinkedList.
7. Сравнить время работы пятого и шестого пунктов
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class hw3 {
    public static void main(String[] args) {
        System.out.println("2. Пусть дан произвольный список целых чисел, удалить из него чётные числа");
        ArrayList<Integer> rnd = new ArrayList<>();
        for (int j = 0; j <= 10; j++) {
            int i = new Random().nextInt(101);
            rnd.add(i);
        }
        System.out.println(rnd);
        rnd.removeIf(n -> (n % 2) == 0);
        System.out.println(rnd);

        System.out.println("""
            1. Реализовать алгоритм обратной сортировки списков компаратором
            (Я взяла на примере  того же списка)""");
        rnd.sort(Comparator.reverseOrder());
        System.out.println(rnd);

        System.out.println("""
            3. Задан целочисленный список ArrayList.Найти минимальное, максимальное и среднее из этого списка.
            (Я взяла на примере того же списка)""");
        int min = rnd.get(0);
        int max = rnd.get(0);
        for (int i: rnd) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Минимальное = " + min + ", максимальное = " + max + ", среднее арифметическое = " + (min + max) / 2);
        System.out.println("4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.");
        ArrayList<Integer> rnd_1 = new ArrayList<>();
        for (int j = 0; j <= 10; j++) {
            int i = new Random().nextInt(20);
            rnd_1.add(i);
        }
        System.out.println(rnd_1);

        ArrayList<Integer> rnd_2 = new ArrayList<>();
        for (int j = 0; j <= 10; j++) {
            int i = new Random().nextInt(20);
            rnd_2.add(i);
        }
        System.out.println(rnd_2);
        rnd_2.removeAll(rnd_1); // оставить "эксклюзивные элементы" второго списка, чтобы присоединить их к первому
        rnd_1.addAll(rnd_2);
        System.out.println(rnd_1);

        System.out.println("""
5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
6. Повторить пятый пункт но с LinkedList.
7. Сравнить время работы пятого и шестого пунктов""");
        double start = System.currentTimeMillis();
        ArrayList<Integer> arr_list = new ArrayList<>();
        for (int j = 0; j <= 10000; j++) {
            arr_list.add(0,0);
        }
        double end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        LinkedList<Integer> lnkd_list = new LinkedList<>();
        for (int j = 0; j <= 10000; j++) {
            lnkd_list.add(0, 0);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("время работы LinkedList у меня получилось быстрее");
    }
}
