public class Merge {
    //对数组a进行排序
    private static Comparable[] assist;

    public static void sort(Comparable[] a) {
        assist=new Comparable[a.length];
        int low=0;
        int hi=a.length-1;
        //对整个数组进行排序
        sort(a,low,hi);

    }

    //对数组a的从索引low到索引height元素进行排序
    public static void sort(Comparable a[], int low, int height) {
         if(low==height){//分组完成
             return;
         }
         //分组界限
         int mid=low+(height-low)/2;
         //递归对左子组进行分组
        sort(a,low,mid);
        //递归对右子组进行分组
        sort(a,mid+1,height);
        //对各组进行归并排序
        merge(a,low,mid,height);
    }

    //进行归并排序
    public static void merge(Comparable[]a,int low,int mid,int height){
     int p=mid+1;//辅助指针
     int q=low;//辅助指针
     int help=low;//辅助数组的辅助指针
        while (q!=mid+1&&p!=height+1){//左子组辅助指针不超过mid，右子组不超过height
            if(compare(a[q],a[p])){//如果左边元素比右边元素小
                assist[help++]=a[q++];
            }else {//如果右边元素比左边元素小
                assist[help++]=a[p++];
            }
        }

        while(q!=mid+1){//将剩余元素加到辅助数组中
            assist[help++]=a[q++];
        }

        while(p!=height+1){//将剩余元素加到辅助数组中
            assist[help++]=a[p++];
        }
         //将辅助数组复制到原数组中
        for (int i = low; i <=height; i++) {
            a[i]=assist[i];
        }
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
