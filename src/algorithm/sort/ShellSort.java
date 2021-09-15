package algorithm.sort;


//希尔排序
public class ShellSort {
    public static void sort(Comparable[] a) {
        //获取希尔排序的增量最大值
        int h=1;
        while(h<a.length/2){
            h=2*h+1;
        }
        while (h >=1) {
            //找到待排序元素
            for (int i = h; i < a.length; i++) {
                //待排序元素排序过程
                for (int j = i; j >=h; j-=h) {
                     if(compare(a[j-h],a[j])){
                         exchange(a,j-h,j);
                     }else {
                         break;//该元素排序完成
                     }
                }
            }
            h/=2;//每排完一次，增量就减小一倍
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
