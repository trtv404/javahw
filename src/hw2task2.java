//    Сравнить скорость работы реплейса классов String и StringBuilder.
// на небольших объемах строки, разница в скорости не значительная (но StringBuilder у меня получился быстрее)

public class hw2task2 {
    public static void main(String[] args) {
        String my_string = """
                Самолет построим сами,
                Понесемся над лесами,
                Понесемся над лесами,
                А потом вернемся к маме""";
        String query = "лесами";
        double begin = System.currentTimeMillis();
        System.out.println();
        System.out.println(my_string.replaceAll(query, "полями"));
        double end = System.currentTimeMillis();
        System.out.println("время выполнения " + (end - begin) + " миллисекунд");
        System.out.println();

        begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(query) > 0) {
            sb.replace(sb.indexOf(query), sb.indexOf(query)+query.length(), "полями");
        }
        System.out.println(sb);
        end = System.currentTimeMillis();
        System.out.println("время выполнения " + (end - begin) + " миллисекунд");
    }
}
