package algorithm;

public class myStack {
	private int maxSize;//栈的最大长度
	private long[] stack;//栈
	private int top ;//指针
	public static void main(String[] args){
	}
	myStack(){
		this(10);//默认栈大小为10
	}
	//构造栈	
	myStack(int size){
		maxSize = size;
		stack = new long[maxSize];
		top=-1;
	}
	//压入数据
	public void push(long value){
//		top ++ ;
		stack[++top] = value;
	}
	//弹出数据
	public long pop(){
		return stack[top--];
	}
	//访问栈顶元素
	public long peek(){
		return stack[top];
	}
	//栈是否为空
	public boolean isEmpty(){
		return (top == -1);
	}
	//栈是否满了
	public boolean isFull(){
		return top == maxSize-1;
	}
}
