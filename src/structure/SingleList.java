package structure;

import java.util.Iterator;

public class SingleList<T> implements Iterable {
    private int N;//链表中元素个数
    private Node head;//头节点


    private class Node {//结点对象
        T elem;
        Node next;

        public Node() {
        }

        public Node(T elem, Node next) {
            this.elem = elem;
            this.next = next;
        }
    }

    public SingleList(){
       this.head=new Node(null,null);//头指针
       this.N=0;
    }


    //将表清空
    public void clear(){
        this.head.next=null;
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
    public T get(int i)  {
        if(i>N){
            return null;
        }
        Node temp=head.next;
        for (int j = 0; j < i; j++) {//找到i索引处节点
            temp=temp.next;
        }
        return temp.elem;
    }

    //往链表末尾插入元素
    public void insert(T elem){
        Node target=new Node(elem,null);//创建新结点
       Node temp=head.next;
       while(temp.next!=null){//找到尾节点
           temp=temp.next;
       }
       temp.next=target;
       N++;
    }

    //在指定索引处插入元素
    public void insert(int i,T elem){
       Node target=new Node(elem,null);//创建新结点
       Node temp=head.next;
       if(i==0){//在第一个元素处插入元素
           target.next=head.next;
           this.head.next=target;
       }
        for (int j = 0; j <i-1; j++) {//找到i索引指向节点的前一个节点
            temp=temp.next;
        }
        target.next=temp.next;
        temp.next=target;
        N++;
    }

    //删除i索引处值并返回
    public T remove(int i){
       if(i==0){//删除的为第一个元素
           Node temp=head.next;
           head.next=temp.next;
           N--;
           return temp.elem;
       }
        Node temp=head.next;
        for (int j = 0; j <i-1; j++) {//找到i索引指向节点的前一个节点
            temp=temp.next;
        }
        Node rmNode=temp.next;//被删除的节点
        temp.next=rmNode.next;
        N--;
        return rmNode.elem;

    }

    //查找元素第一次出现的位置
    public int indexOf(T elem){
        Node temp=head.next;
        for (int i = 0; i <N; i++) {
            if(temp.elem.equals(elem)){
                return i;
            }
        }
        return -1;
    }

    //获得迭代器
    @Override
    public Iterator iterator() {
        return new SItr();
    }

    private class SItr implements Iterator{

        private Node temp;
        public SItr(){
            this.temp=head;
        }

        @Override
        public boolean hasNext() {
            return temp.next!=null;
        }

        @Override
        public Object next() {
            return temp.next.elem;
        }
    }
}


