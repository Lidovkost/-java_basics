package homework.HomeWork1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        LinkedList<Double> linkList = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        Double result = Operations(in);
        linkList.add(result);
        Integer whatToDo = Nextstep(in);
        while (whatToDo!=3) {
            if (whatToDo==1) {
                result = OperationNext(in, result);
                linkList.add(result);
            }
            if (whatToDo ==2){
                linkList.removeLast();
                result = linkList.getLast();
            }
            whatToDo = Nextstep(in);
            
        }
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
    static Double Operations(Scanner in){
        System.out.print("Input a number 1: ");
        Double num1 = in.nextDouble();
        System.out.print("Input operation: ");
        String op = in.next();
        System.out.print("Input a number 2: ");
        Double num2 = in.nextDouble();
        String text = String.format("%g %s %g = %g \n", num1, op, num2, DoOperation(op.charAt(0), num1, num2));
        System.out.printf(text);
        WriteTofile("file.log", text);
        Double result = DoOperation(op.charAt(0), num1, num2);
        return result;
    }
    static Double OperationNext(Scanner in, Double result){
        String num1 = String.format("number 1 = %g\n", result);
        System.out.print(num1);
        System.out.print("Input operation: ");
        String op = in.next();
        System.out.print("Input a number 2: ");
        Double num2 = in.nextDouble();
        String text = String.format("%g %s %g = %g \n", result, op, num2, DoOperation(op.charAt(0), result, num2));
        System.out.printf(text);
        result = DoOperation(op.charAt(0), result, num2);
        WriteTofile("file.log", text);
        return result;
    }

    static Integer Nextstep(Scanner in){
        System.out.println("1 - следующая операция / 2 - отмена операции / 3 - выход");
            return in.nextInt();
    }
    static LinkedList<Double> AddToLinkList(LinkedList<Double> list){
        return list;
    }
    static void WriteTofile(String path, String text){
        String oldText = ReadFile(path);
        try(FileWriter writer = new FileWriter(path, false))
        {
            writer.write(oldText);
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
    }

    static String ReadFile(String path){
        String str = "";
        String result = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
        while ((str = br.readLine()) != null) {
        result = result + str + '\n';
        }

        br.close();
        return result;
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
