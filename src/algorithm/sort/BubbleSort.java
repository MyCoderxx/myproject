package algorithm.sort;

//冒泡排序
public class BubbleSort {

    public static void sort(Comparable [] a){
        for (int i = a.length-1; i>0; i--){
           boolean flag=false;//设置是否完成的标记域
            for (int j = 0; j < i; j++) {
                if(compare(a[j],a[j+1])){//前面元素大
                    exchange(a,j,j+1);//交换相邻元素
                    flag=true;//交换则设置标记位
                }
            }
            if(flag==false){//未交换元素则代表排序完成
                return ;
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
