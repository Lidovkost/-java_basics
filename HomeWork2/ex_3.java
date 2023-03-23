package homework.HomeWork2;
public class ex_3 {
    public static void main(String[] args) {
        System.out.println(IsPolimorf("арозаупаланалапуазора"));
    }
    static Boolean IsPolimorf(String str){
        String clone = reverseString2(str); // reverseString1(str);
        return str.equals(clone);
    }
    //реверс через рекурсию
    public static String reverseString1(String str) {
        if (str.length() <= 1) {
           return str;
        }
        return reverseString1(str.substring(1)) + str.charAt(0);
      }
    // реверс через стрингбилдер и charat
    public static String reverseString2(String str) {
        Character ch;
        Character ch2;
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length()/2; i++) {
            ch = str.charAt(i);
            ch2 = str.charAt(str.length()-1-i);
            sb.setCharAt(str.length()-1-i, ch);
            sb.setCharAt(i, ch2);
        }
        return sb.toString();
      }
}
