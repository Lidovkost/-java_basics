package homework.HomeWork4;
import java.util.LinkedList;

public class ex_2 {
    public static void main(String[] args) {
        Integer num1 = 1;
        Integer num2 = 2;
        Integer num3 = 3;
        Integer num4 = 4;
        Integer num5 = 5;

        Queue<Integer> linkList = new Queue<>();
        linkList.add(num1);
        linkList.add(num2);
        linkList.add(num3);
        linkList.add(num4);
        linkList.add(num5);

        System.out.println(linkList);
        linkList.enqueue(2);
        System.out.println(linkList);
        Integer temp = linkList.dequeue();
        System.out.println(temp);
        System.out.println(linkList);
        System.out.println(linkList.first()); 
    }
//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
}
class Queue<HTreeNode>  extends LinkedList<HTreeNode>{
    
    public void enqueue(Integer index){
        var temp = this.get(index);
        this.remove(temp);
        this.add(temp);
    }
    public Integer dequeue(){
        Integer temp = (Integer) this.getFirst();
        this.remove(temp);
        return temp;
    }
    public Integer first(){
        return (Integer) this.get(0);
    }
}
