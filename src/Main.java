import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.add(4, 10);
        System.out.println(list.indexOf(4));
//        list.remove();

        System.out.println(list);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(2, 45);

        System.out.println(list2);

        list.remove(2);
        list.add(2, 69);

        System.out.println(list);
    }
}
