package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static Map<String, ArrayList<String>> map = new HashMap<>();

    public static void add(String familyName, String phoneNumber) {
        if (!map.containsKey(familyName)) {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(phoneNumber);
            map.put(familyName, arrayList);
        } else {
            ArrayList<String> numbers = map.get(familyName);
            numbers.add(phoneNumber);
            map.put(familyName, numbers);
        }
    }

    public static void get(String familyName) {
        for (int i = 0; i < map.get(familyName).size(); i++) {
            System.out.println(map.get(familyName).get(i));
        }
    }
}
