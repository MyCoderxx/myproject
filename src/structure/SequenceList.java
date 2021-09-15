package structure;

import java.util.Iterator;

public class SequenceList<T> implements Iterable  {
    private int N;//表中元素个数
    private T []elems;//存放元素数组

    public SequenceList(int capacity){//capacity为初始容量
        this.elems=(T[]) new Object[capacity];
    }

    //将顺序表长度置为newSize大小
    public void resize(int newSize){

    }

    //将表清空
    public void clear(){
    }

    //判断是否为空
    public boolean isempty(){
        return false;
    }

    //返回数组元素个数
   public int length(){
        return N;
   }

   //得到i索引处元素值
   public T get(int i){
        return null;
   }

   //往数组末尾插入元素
    public void insert(T elem){

    }

    //在指定索引处插入元素
    public void insert(int i,T elem){

    }

    //删除i索引处值并返回
    public T remove(int i){
      return null;
    }

    //查找元素第一次出现的位置
    public int indexOf(T elem){
        return 0;
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
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
