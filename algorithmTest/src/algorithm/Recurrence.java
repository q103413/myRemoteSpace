package algorithm;

public class Recurrence {
	public static void main(String[] args) {
		Recurrence re = new Recurrence();
		System.out.println(re.fibonacci(4));
	}
	//斐波那契數列
	public int fibonacci(int n){
		if (n==1 || n==2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
//	有一堆数量为N的球，一次只能从球堆中拿一个或者拿两个球，问把球拿完总共有多少种取法。 
//	解法2:排列组合。 
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
	//三角數列
	public int test0(int n){
		if (n==1) {
			return 1;
		}
		return test0(--n)+n;
	}
}
