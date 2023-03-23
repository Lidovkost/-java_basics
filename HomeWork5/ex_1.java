package homework.HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> namesAndNumbers = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer nextMove = 0;
        while (nextMove!=3) {
            System.out.print("Введите 1) Добавление номера\n2) Вывод всего\n3) выход\n: ");
            nextMove = in.nextInt();
            if (nextMove == 1) {
                IAddNumber(in, namesAndNumbers); 
            }
            if (nextMove == 2) {
                SwowNumbers(namesAndNumbers);
            }
        }
        in.close();
    }
    static void AddNumber(HashMap<String, List<Integer>> namesAndNumbers, Integer number, String name)
    {
        if (namesAndNumbers.containsKey(name)) {
            List<Integer> numbers = namesAndNumbers.get(name);
            numbers.add(number);
            namesAndNumbers.put(name, numbers);
            return;
        }
        List<Integer> numbers =  new ArrayList<>();
        numbers.add(number);
        namesAndNumbers.put(name, numbers);
    }
    static void SwowNumbers(HashMap<String, List<Integer>> namesAndNumbers)
    {
        System.out.println(namesAndNumbers);
    }
    static void IAddNumber(Scanner in, HashMap<String, List<Integer>> namesAndNumbers)
    {
        System.out.println("Введите фамилию: ");
        String name = in.next();
        System.out.println("Введите номер: ");
        Integer number = in.nextInt();
        AddNumber(namesAndNumbers, number, name);
    }
}
