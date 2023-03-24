package homework.HomeWork6;

import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        NoteBook Asus87 = new NoteBook("Windows", 500, 50, 40000, "Black");
        NoteBook Honor66 = new NoteBook("Windows", 1000, 60, 50000, "Black");
        NoteBook Lenovo123 = new NoteBook("Linux", 400, 70, 60000, "Black");
        NoteBook Honor666 = new NoteBook("Linux", 600, 80, 70000, "White");
        NoteBook Asus224 = new NoteBook("Windows", 700, 90, 20000, "Black");
        NoteBook Asus333 = new NoteBook("Linux", 450, 100, 25000, "White");
        NoteBook LenovoL800 = new NoteBook("Windows", 740, 85, 90000, "Black");
        NoteBook Sams1000 = new NoteBook("Windows", 900, 100, 10000, "Black");
        Scanner in = new Scanner(System.in);
        List<NoteBook> noteBooks = SearchParam(in, NoteBook.NoteBooks);
        ShowNoteBooks(noteBooks);
        in.close();

    }
    static void ShowNoteBooks(List<NoteBook> notebooks)
    {
        int i = 1;
        for (NoteBook noteBook : notebooks) {
            String text = String.format("%d. OS: %s, Hard disk capicity: %d, ram: %d, price = %d, color: %s \n",
             i++, noteBook.operatingSystem, noteBook.hardDiskCapacity, noteBook.ram, noteBook.price, noteBook.color);
            System.out.println(text);
        }
    }
    static List<NoteBook> SearchByOS(List<NoteBook> notebooks, Scanner in)
    {
        System.out.println("Введите название ОС: ");
        String os = in.next();
        return NoteBook.OperatingSystems(os, notebooks);
    }
    static List<NoteBook> SearchByHDC(List<NoteBook> notebooks, Scanner in)
    {
        System.out.println("Введите минимальный объем диска: ");
        Integer minHDC = in.nextInt();
        return NoteBook.HardDiskCapacities(minHDC, notebooks);
    }
    static List<NoteBook> SearchByRam(List<NoteBook> notebooks, Scanner in)
    {
        System.out.println("Введите минимальный объем ОЗУ: ");
        Integer minRam = in.nextInt();
        return NoteBook.Rams(minRam, notebooks);
    }
    static List<NoteBook> SearchByprice(List<NoteBook> notebooks, Scanner in)
    {
        System.out.println("Введите минимальную стоимость: ");
        Integer minPrice = in.nextInt();
        return NoteBook.Prices(minPrice, notebooks);
    }
    static List<NoteBook> SearchByColor(List<NoteBook> notebooks, Scanner in)
    {
        System.out.println("Введите цвет: ");
        String color = in.next();
        return NoteBook.Colors(color, notebooks);
    }
    static List<NoteBook> SearchParam(Scanner in, List<NoteBook> noteBooks)
    {
        Integer nextStep = -1;
        List<NoteBook> temp = noteBooks;
        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            System.out.println("1 - операционная система");
            System.out.println("2 - объем диска");
            System.out.println("3 - ОЗУ");
            System.out.println("4 - цена");
            System.out.println("5 - цвет");
            System.out.println("0 - вывести подходящие выбранным условиям.");
            System.out.println("10 - отменить текущие фильтры.");
            nextStep = in.nextInt();
            if(nextStep == 1)
            {
                noteBooks = SearchByOS(noteBooks, in);
            }
            if (nextStep == 2)
            {
                noteBooks = SearchByHDC(noteBooks, in);    
            }
            if (nextStep == 3)
            {
                noteBooks = SearchByRam(noteBooks, in);    
            }
            if (nextStep == 4)
            {
                noteBooks = SearchByprice(noteBooks, in);   
            }
            if (nextStep == 5)
            {
                ShowNoteBooks(noteBooks);
                noteBooks = SearchByColor(noteBooks, in);
                ShowNoteBooks(noteBooks);
            }
            if (nextStep==10) 
            {
                return SearchParam(in, temp);
            }
            if (nextStep == 0) 
            {
                return noteBooks;
            }
        }
    }
}
