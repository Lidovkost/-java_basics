package homework.HomeWork2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class ex_2 {
    public static void main(String[] args) {
        String path = "work2_Ex2.txt";
        String regex1 = "\n";
        String regex2 = ",";
        String regex3 = ":";
        HashMap<String, String> map =
                new HashMap<>();
        String textFormFile = ReadFile(path);
        String[] pairs = textFormFile.split(regex1);
        for (String string : pairs) {
            String[] maps = string.split(regex2);
            for (String m : maps) {
                String[] KeyAndValue = m.split(regex3);
                KeyAndValue[0] = KeyAndValue[0].replaceAll("\"", "");
                KeyAndValue[1] = KeyAndValue[1].replaceAll("\"", "");
                map.put(KeyAndValue[0], KeyAndValue[1]);
            }
            System.out.printf("Студент %s получил %s по предмету %s\n",
            map.get("фамилия"), map.get("оценка"), map.get("предмет"));
        }
    }
    static String ReadFile(String path){
        String str = "";
        String result = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8))){
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
