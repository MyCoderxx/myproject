import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       Integer[]a={1,15,5,9,8,3,4,6,7};
        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));//[1, 3, 4, 5, 6, 7, 8, 9, 15]
    }
}
