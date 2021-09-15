package algorithm.sort;


//选择排序
public class SelectSort {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (compare(a[minIndex], a[j])) {//比当前最小元素小
                    minIndex = j;
                }
            }
            exchange(a, i, minIndex);
        }
    }

    public static boolean compare(Comparable a,Comparable b){
        return a.compareTo(b)>0;
    }

    public static void  exchange(Comparable []a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
