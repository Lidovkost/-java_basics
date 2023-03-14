package homework.HomeWork2;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ex_1 {
    public static void main(String[] args) {
        String path = "My.txt";
        int size = 10;
        int maxValue = 100;
        int[] myArr = CreateArray(size, maxValue);
        WriteTofile(path, myArr);
        BubleSort(myArr, path);
    }

    static int[] CreateArray(int size, int maxValue){
        int[] array = new int[size];
        int start = 0;
        Random random = new Random();
        IntStream.range(start, size).forEach(index -> array[index] = random.nextInt(maxValue));
        return array;
    }

    static void WriteTofile(String path, int[] array){
        String oldText = ReadFile(path);
        try(FileWriter writer = new FileWriter(path, false))
        {
            String text = Arrays.toString(array);
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
        try(BufferedReader br = new BufferedReader(new FileReader("my.txt"))){
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
    
    static void BubleSort(int[] array, String path){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){  
                    temp = array[j+1];  
                    array[j+1] = array[j];  
                    array[j] = temp;
                    WriteTofile(path, array);
                }
            } 
        }
    }
}
