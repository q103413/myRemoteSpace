package algorithm;

import java.util.LinkedList;
class Queue{
//	Queue<Integer> queue = new LinkedList<>();//可以直接用java工具包
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	public Queue(int s){
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear= -1;
		nItems= 0;
	}
	//Insert()方法运行的前提条件是队列不满
	public void insert(long j){
		if (rear == maxSize-1) {
			rear=-1;
		}
		queArray[++rear]=j;
		nItems++;
	}
	public long remove(){
		long temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	public long peekFront(){
		return queArray[front];
	}
	public boolean isEmpty(){
		return (nItems ==0);
	}
	public boolean isFull(){
		return (nItems == maxSize);
	}
	public int size(){
		return nItems;
	}
}
public class myQueue<E> {
	private Object[] data = null;
	private int maxSize;//队列容量
	private int front;//队列头，允许删除
	private int rear;//队列尾，允许插入
	//构造函数
	public myQueue(){
		this(10);
	}
	public myQueue(int initialSize){
		if (initialSize >= 0) {
			this.maxSize = initialSize;
			data = new Object[initialSize];
			front = rear = 0;
		}else {
			throw new RuntimeException("初始化大小不能小于0");
		}
	}
	//判空
	public boolean empty(){
		return rear==front?true:false;
	}
	//插入
	public boolean add(E e){
		if (rear == maxSize) {
			throw new RuntimeException("隊列已滿，無法插入新的元素!");
		}else{
			data[rear++] = e;
			return true;
		}
	}
	//返回隊首元素，但不刪除
	public E peek(){
		if (empty()) {
			throw new RuntimeException("空隊列異常");
		}else{
			return (E)data[front];
		}
	}
	//出队
	public E poll(){
		if (empty()) {
			throw new RuntimeException("空队列异常！");
		}else{
			E value = (E) data[front];//保留	队列的	front端的元素的值
			data[front++] = null;//释放队列的front端的元素
			return value;
		}
	}
	//队列长度
	public int length(){
		return rear - front;
	}
}
