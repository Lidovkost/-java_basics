package homework.HomeWork1;
import java.util.ArrayList;
import java.util.List;
public class Ex2 {
    public static void main(String[] args) {
        int a = 1000;
        System.out.println(PrimeNumbers(a));

        
    }
    static List<Integer> PrimeNumbers(int number){
        List<Integer> numbersList = new ArrayList<>();
        if (number == 1) {
            return numbersList;
        }
        if (PrimeNumber(number)) {
            numbersList.add(number); 
        }
        numbersList.addAll(PrimeNumbers(--number));
        return numbersList;
    }
    static boolean PrimeNumber(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i == 0) {
            return false;
            }
        }
        return true;
    }
}
