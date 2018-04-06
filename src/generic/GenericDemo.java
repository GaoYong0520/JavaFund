package generic;

public class GenericDemo {
    public static void main(String[] args) {
        Integer[] numArray = {1,2,3,4};
        String[] strArray = {"sjakdbk","akjsbd","ahsvdjag"};

        printArray(numArray);
        printArray(strArray);

        int max = maxValue(1,2,3);
        String maxStr = maxValue("apple","pig","dog");

        System.out.println(max);
        System.out.println(maxStr);
    }

    public static <T> void printArray(T[] array) {
        for (T element :
                array
             ) {
            System.out.println(element);
        }
    }

    public static <T extends Comparable<T>> T maxValue(T x, T y, T z) {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }
}
