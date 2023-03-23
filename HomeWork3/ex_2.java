package homework.HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class ex_2 {
    public static void main(String[] args) {
        List<Integer> list = CreateIntList(10, 10);
        System.out.println(list);
        list = UnevenFromList(list);
        System.out.println(list);


                                         

    }
    static List<Integer> UnevenFromList(List<Integer> ints){
        return ints.stream()
                    .filter(x -> (x % 2 != 0))
                    .collect(Collectors.toList());    
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

