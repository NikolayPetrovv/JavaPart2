package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {

    public static void main(String[] args) {
        //Первое задание+
        String[] words = new String[]{"Один", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять"};
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }
        //Смотрим результат
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        //Первое задание-

        //Второе задание+
        //Из задания непонятно, необходимо ли создавать экземпляр класса и оперировать этим объектом, поэтому сделал как удобно, статиками.
        PhoneBook.add("Иванов", "+7(495)333-88-88");
        PhoneBook.add("Иванов", "+7(495)333-88-89");
        PhoneBook.add("Петров", "+7(495)444-11-22");
        PhoneBook.add("Сидоров", "+7(495)555-33-44");
        PhoneBook.get("Иванов");
        PhoneBook.get("Петров");
        PhoneBook.get("Сидоров");
        //Второе задание-

    }


}
