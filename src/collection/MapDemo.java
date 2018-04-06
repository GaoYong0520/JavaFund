package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"mser");
        students.put(2,"yyc");
        students.put(3,"dkz");

        for (Integer key :
                students.keySet()) {
            System.out.println("id=" + key + " " + "name=" + students.get(key));
        }

        Iterator<Map.Entry<Integer,String>> it = students.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //大容量
        for (Map.Entry<Integer, String> entry :
                students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //通过students.values()遍历所有的value，但不能遍历key
        for (String name :
                students.values()) {
            System.out.println(name);
        }
    }
}
