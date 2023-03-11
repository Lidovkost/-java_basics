package homework.HomeWork1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        Double num1 = in.nextDouble();
        System.out.print("Input operation(or end to exit): ");
        String op = in.next();
        System.out.print("Input a number 2: ");
        Double num2 = in.nextDouble();
        String text = String.format("%g %s %g = %g \n", num1, op, num2, DoOperation(op.charAt(0), num1, num2));
        System.out.printf(text);
        WriteTofile("file.log", text);               
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
