package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        integers.add(4);
        strings.add("mser");

        getData(strings);
        getNumData(integers);
        // getNumData("mser"); error
    }

    public static void getData(List<?> list) {
        System.out.println(list.get(0));
    }

    public static void getNumData(List<? extends Number> data) {
        System.out.println(data.get(0));
    }
}
