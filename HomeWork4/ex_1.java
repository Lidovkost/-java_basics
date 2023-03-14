package homework.HomeWork4;

import java.util.LinkedList;

public class ex_1 {
    public static void main(String[] args) {
        String str1 = new String("my");
        String str2 = new String("name");
        String str3 = new String("is");
        String str4 = new String("Kostya");

        LinkedList<String> linkList = new LinkedList<String>();
        linkList.add(str1);
        linkList.add(str2);
        linkList.add(str3);
        linkList.add(str4);
 
        System.out.println(linkList);
        linkList = reverseLinkedList(linkList);
        System.out.println(linkList);
    }
    static LinkedList<String> reverseLinkedList(LinkedList<String> list){
        LinkedList<String> revLinkList = new LinkedList<String>();
        for (int index = list.size()-1; index >= 0; index--) {
            revLinkList.add(list.get(index));
        }
        return revLinkList;
    }
}

