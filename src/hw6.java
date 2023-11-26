import java.util.*;

// Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент, метод toArray возвращающий строку с
// элементами множества и метод позволяющий читать элементы по индексу.
//*Реализовать все методы из семинара.
//Формат данных Integer.

public class hw6 {
    public static void main(String[] args) {

        mySet mySet = new mySet();

        for (int i = 0; i < 10; i++) {
            mySet.add(new Random().nextInt(20));
            }
        System.out.println(mySet.getMySet(7)); // есть ли эл-т со значением 7
        System.out.println(Arrays.toString(mySet.toArray())); // вернуть в виде строки
        Iterator<Integer> iter = mySet.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
            }
        System.out.println();
        System.out.println(mySet.getItem(3)); // ыернуть эл-т под третьим индексом
        }
    }
    class mySet {
        private HashMap<Integer, Object> hashMap = new HashMap<>();
        // если TreeMap - то он автоматически отсортирует по старшенству
        // если LinkedHashMap - то он будет запоминать порядок ввода
        // если просто HashMap - то ни порядка добавления, ни сортировки. Но отсортировать можно Comparator'ом.

        static final Object OBJECT = new Object();

        public boolean add(int num){
            HashSet<Integer> integers;
            return hashMap.put(num, OBJECT) == null;
            }

        public boolean getMySet(int num){
            return hashMap.containsKey(num);
        }

        public Object[] toArray() {
            return hashMap.keySet().toArray();
        }

        public Iterator<Integer> iterator() {
            return hashMap.keySet().iterator();
        }

        public Integer getItem(int index) {
            return (Integer) toArray()[index]; // преобразование в Integet, хотя toArray()[index] возвращает Object
            }
    }

