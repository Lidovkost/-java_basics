package homework.HomeWork1;
public class Ex1 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(Nsum(number));
        System.out.println(Nfactorial(number));
    }
    static int Nsum(int number){
        if (number == 1) {
            return number;
        }
        return number + Nsum(--number);
    }
    static int Nfactorial(int number){
        if (number == 1) {
            return number;
        }
        return number * Nfactorial(--number);
    }
}
