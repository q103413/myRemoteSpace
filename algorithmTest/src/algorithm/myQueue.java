package algorithm;

import java.util.LinkedList;
class Queue{
//	Queue<Integer> queue = new LinkedList<>();//����ֱ����java���߰�
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
	//Insert()�������е�ǰ�������Ƕ��в���
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
	private int maxSize;//��������
	private int front;//����ͷ������ɾ��
	private int rear;//����β���������
	//���캯��
	public myQueue(){
		this(10);
	}
	public myQueue(int initialSize){
		if (initialSize >= 0) {
			this.maxSize = initialSize;
			data = new Object[initialSize];
			front = rear = 0;
		}else {
			throw new RuntimeException("��ʼ����С����С��0");
		}
	}
	//�п�
	public boolean empty(){
		return rear==front?true:false;
	}
	//����
	public boolean add(E e){
		if (rear == maxSize) {
			throw new RuntimeException("����ѝM���o�������µ�Ԫ��!");
		}else{
			data[rear++] = e;
			return true;
		}
	}
	//�������Ԫ�أ������h��
	public E peek(){
		if (empty()) {
			throw new RuntimeException("����Ю���");
		}else{
			return (E)data[front];
		}
	}
	//����
	public E poll(){
		if (empty()) {
			throw new RuntimeException("�ն����쳣��");
		}else{
			E value = (E) data[front];//����	���е�	front�˵�Ԫ�ص�ֵ
			data[front++] = null;//�ͷŶ��е�front�˵�Ԫ��
			return value;
		}
	}
	//���г���
	public int length(){
		return rear - front;
	}
}
