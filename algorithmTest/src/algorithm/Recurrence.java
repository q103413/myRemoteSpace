package algorithm;

public class Recurrence {
	public static void main(String[] args) {
		Recurrence re = new Recurrence();
		System.out.println(re.fibonacci(4));
	}
	//쳲���������
	public int fibonacci(int n){
		if (n==1 || n==2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
//	��һ������ΪN����һ��ֻ�ܴ��������һ���������������ʰ��������ܹ��ж�����ȡ���� 
//	�ⷨ2:������ϡ� 
	public int getBall(int n){
		if (n==1) {
			return 1;
		}
		if (n==0) {
			return 0;
		}
		if (n==2) {
			return 2;
		}
		return getBall(n-1)+getBall(n-2);
	}
	//���ǔ���
	public int test0(int n){
		if (n==1) {
			return 1;
		}
		return test0(--n)+n;
	}
}
