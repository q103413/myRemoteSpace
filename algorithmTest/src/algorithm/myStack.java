package algorithm;

public class myStack {
	private int maxSize;//ջ����󳤶�
	private long[] stack;//ջ
	private int top ;//ָ��
	public static void main(String[] args){
	}
	myStack(){
		this(10);//Ĭ��ջ��СΪ10
	}
	//����ջ	
	myStack(int size){
		maxSize = size;
		stack = new long[maxSize];
		top=-1;
	}
	//ѹ������
	public void push(long value){
//		top ++ ;
		stack[++top] = value;
	}
	//��������
	public long pop(){
		return stack[top--];
	}
	//����ջ��Ԫ��
	public long peek(){
		return stack[top];
	}
	//ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return (top == -1);
	}
	//ջ�Ƿ�����
	public boolean isFull(){
		return top == maxSize-1;
	}
}
