package structure;

import java.util.Iterator;

public class SequenceList<T> implements Iterable  {
    private int N;//表中元素个数
    private T []elems;//存放元素数组

    public SequenceList(int capacity){//capacity为初始容量
        this.elems=(T[]) new Object[capacity];
        N=0;
    }

    //将顺序表长度置为newSize大小
    public void resize(int newSize){
        T[]temp=elems;
        elems= (T[]) new Object[newSize];
        for (int i = 0; i < temp.length; i++) {
            elems[i]=temp[i];
        }
    }

    //将表清空
    public void clear(){
        this.N=0;
    }

    //判断是否为空
    public boolean isempty(){
        return this.N==0;
    }

    //返回数组元素个数
   public int length(){
        return N;
   }

   //得到i索引处元素值
   public T get(int i){
        return elems[i];
   }

   //往数组末尾插入元素
    public void insert(T elem){
        if(N==elems.length){//顺序表已满
            resize(elems.length*2);//容量增加2倍
        }
      elems[N++]=elem;
    }

    //在指定索引处插入元素
    public void insert(int i,T elem){
        if(N==elems.length){//顺序表已满
            resize(elems.length*2);//容量增加2倍
        }
        for (int j = N; j>i; j--) {//i索引处后的元素向后移动
            elems[j]=elems[j-1];
        }
        elems[i]=elem;
        N++;
    }

    //删除i索引处值并返回
    public T remove(int i){
        T elem=elems[i];
        for (int j = i; j<N-1; j++) {//i索引处后的元素向后移动
            elems[j]=elems[j+1];
        }
        N--;
        if(N<elems.length/4){//顺序表太空
            resize(elems.length/2);//容量减少2倍
        }
        return elem;
    }

    //查找元素第一次出现的位置
    public int indexOf(T elem){
        for (int i = 0; i < N; i++) {
            if(elems[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }

    //获得迭代器
    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator{

        private int cusor;
        public Itr(){
            this.cusor=0;
        }

        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return elems[cusor++];
        }
    }
}
