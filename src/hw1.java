   /*
Первый семинар.
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
Пункты реализовать в методе main
*Пункты реализовать в разных методах
int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.lang.Short;
import java.lang.Integer;

public class hw1 {

    public static void main(String[] args) {
        int i = new Random().nextInt(2001); //1
        System.out.println(i);    // для проверки
        System.out.println(Integer.toBinaryString(i));    // для проверки
        int n = Integer.toBinaryString(i).length(); //2
        System.out.println(n);    // для проверки

        ArrayList<Integer> m1List = new ArrayList<Integer>(); //3
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) m1List.add(j);
            };
        int m1[] = new int[m1List.size()]; //перевод из списка в массив
        for (int j = 0; j < m1List.size(); j++) {
            m1[j] = m1List.get(j);
            }

        ArrayList<Integer> m2List = new ArrayList<Integer>(); //4
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) m2List.add(j);
        };
        int m2[] = new int[m2List.size()]; //перевод из списка в массив
        for (int j = 0; j < m2List.size(); j++) {
            m2[j] = m2List.get(j);
        }
            /*        StringBuilder m1 = new StringBuilder();
            for (int j = i; j < Short.MAX_VALUE; j++) {
                if (j%n == 0) m1.append(" " + j);
            };
        System.out.println(m1);

        StringBuilder m2 = new StringBuilder();
            for (int j = Short.MIN_VALUE; j < i; j++) {
                if (j%n != 0) m2.append(" " + j);
            };
        System.out.println(m2);

 */
        }
    }

