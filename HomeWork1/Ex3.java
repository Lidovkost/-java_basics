package homework.HomeWork1;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        Double num1 = in.nextDouble();
        System.out.print("Input operation: ");
        String op = in.next();
        System.out.print("Input a number 2: ");
        Double num2 = in.nextDouble();
        System.out.printf("%g %s %g = %g \n", num1, op, num2, DoOperation(op.charAt(0), num1, num2));
        in.close();
    }
    static Double DoOperation(char op, double n1, double n2){
        if (op == '+') {
          return n1 + n2;  
        }
        if (op == '-') {
            return n1 - n2;  
        }
        if (op == '/') {
            return n1 / n2;  
        }
        if (op == '*') {
            return n1 * n2;  
        }
        else
            return null;
    }
}
