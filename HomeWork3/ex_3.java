package homework.HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class ex_3 {
    public static void main(String[] args) {
        List<Integer> list = CreateIntList(10, 10);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Integer sum = list.stream().mapToInt(Integer::intValue).sum()/list.size();
        System.out.println(sum);
    }
    static List<Integer> CreateIntList(Integer count, Integer maxValue){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
                    list.add(random.nextInt(maxValue));
        }
        return list;
    }
}
