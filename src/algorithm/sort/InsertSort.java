package algorithm.sort;


//插入排序
public class InsertSort {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j>0; j--) {
                if (compare(a[j-1], a[j])) {
                    exchange(a, j-1, j);
                }else {
                    break;
                }
            }

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
