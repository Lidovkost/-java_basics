package homework.HomeWork5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ex_2 {
    public static void main(String[] args) {
        String[] workers = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };
        HashMap<String, Integer> names = new HashMap<>();
        for (String string : workers) {
            String[] nameAndSurname = string.split(" ");
            AddName(names, nameAndSurname[0]);
        }
        System.out.println(names);
        names.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);
    }
    static void AddName(HashMap<String, Integer> names, String name){
        Integer startCount = 1;
        if (names.containsKey(name)) {
            Integer count = names.get(name)+startCount;
            names.put(name, count);
            return;
        }
        names.put(name, startCount);
    }
}
