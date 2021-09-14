public class QuickSort {

    //对数组a进行排序
    public static void sort(Comparable[] a) {
        int low=0;
        int hight=a.length-1;
        //对整个数组进行排序
        sort(a,low,hight);
    }

    //对数组a的从索引low到索引height元素进行排序
    public static void sort(Comparable a[], int low, int height) {
       //结束递归
       if(low>=height){
           return;
       }
       //进行分组
        int partition = partition(a, low, height);
        sort(a,low,partition-1);
        sort(a,partition+1,height);
    }

    //进行分组排序
    public static int partition(Comparable[]a,int low,int height){
        int left=low;
        int right=height+1;
        Comparable key=a[low];
        while(right>left){//该分组排序完成
            while(compare(key,a[--right])){//遍历右指针找到比key小的元素
                if(right==low) break;
            }
            while(compare(a[++left],key)){//遍历左指针找到比key大的元素
                if(left==height) break;
            }
            if(left<right){
                exchange(a,left,right);
            }
        }
        exchange(a,low,right);
        return right;
    }


    public static boolean compare(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    public static void  exchange(Comparable []a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}




