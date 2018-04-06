package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(54);

        //Iterator
        //该方法可以不用担心在遍历的过程中会超出集合的长度。
        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
