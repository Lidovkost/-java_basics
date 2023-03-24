package homework.HomeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NoteBook {
    public final String operatingSystem;
    public final Integer hardDiskCapacity;
    public final Integer ram;
    public final String color;
    public final Integer price;
    public static List<NoteBook> NoteBooks = new ArrayList();
    public NoteBook(String operatingSystem, Integer hardDiskCapacity, Integer ram, Integer price, String color){
        this.operatingSystem = operatingSystem;
        this.hardDiskCapacity = hardDiskCapacity;
        this.ram = ram;
        this.color = color;
        this.price = price;
        NoteBooks.add(this);
    }
    public static List<NoteBook> OperatingSystems(String operatingSystem, List<NoteBook> NoteBooks)
    {
        List<NoteBook> OS = NoteBooks.stream().filter(s->s.operatingSystem.equals(operatingSystem))
                .collect(Collectors.toList());
        return OS;
    }
    public static List<NoteBook> Colors(String color, List<NoteBook> NoteBooks)
    {
        List<NoteBook> colors = NoteBooks.stream().filter(s->s.color.equals(color))
                .collect(Collectors.toList());
        return colors;
    }
    public static List<NoteBook> HardDiskCapacities(Integer hardDiskCapacity, List<NoteBook> NoteBooks)
    {
        Predicate<NoteBook> byhardDiskCapacity = HDC -> HDC.hardDiskCapacity > hardDiskCapacity;
        List<NoteBook> HDC = NoteBooks.stream().filter(byhardDiskCapacity)
                .collect(Collectors.toList());
        return HDC;
    }
    public static List<NoteBook> Rams(Integer ram, List<NoteBook> NoteBooks)
    {
        Predicate<NoteBook> byRam = RAM -> RAM.ram > ram;
        List<NoteBook> RAM = NoteBooks.stream().filter(byRam)
                .collect(Collectors.toList());
        return RAM;
    }
    public static List<NoteBook> Prices(Integer price, List<NoteBook> NoteBooks)
    {
        List<NoteBook> prices = NoteBooks.stream().filter(s->s.price > price)
                .collect(Collectors.toList());
        return prices;
    }
    

}
