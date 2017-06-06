package leetCode;

import java.util.*;

public class LeetCodeAlgorithm {
	public String FindLetter() {
		String s = "abcd", t = "abcde";
		Random ra = new Random();
		float aa = ra.nextFloat();
		System.out.println(aa);
		return "";
	}

	public char[] subChar(char[] ch, int start, int length) {
		if (ch.length < length || start < 0 || start >= ch.length || start + length > ch.length) {
			return null;
		}
		char[] res = new char[length];
		for (int i = start; i < start + length; i++) {
			res[i - start] = ch[i];
		}
		return res;
	}

	public int secondLagest(int[] a) {
		// ����ȥ��
		HashSet<Integer> set = new HashSet();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		if (set.size() < 2) {
			return -1;
		}
		int max = -1, sMax = -1;
		int[] x = new int[set.size()];
		Iterator<Integer> re = set.iterator();
		for (int i = 0; i < x.length; i++) {
			x[i] = re.next();
		}
		System.out.println(Arrays.toString(x));
		while (re.hasNext()) {
			int one = re.next();// �ص㣺һ������������ֻ����һ��it.next
			// System.out.println(one);
			if (one > max) {
				sMax = max;
				max = one;
			} else {
				if (one > sMax) {
					sMax = one;
				}
			}
		}
		return sMax;
	}

	// ��Ŀ����һ��3*3����Խ���Ԫ��֮��
	// 1.�������������˫��forѭ�����������ά���飬�ٽ�a[i][i]�ۼӺ������
	public void sumDuiJiao() {
		double sum = 0;
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 7, 8 } };
		for (int i = 0, j = 0; i < 3; i++, j++) {
			sum = sum + array[i][j];
		}
		for (int i = 0, j = 2; i < 3; i++, j--) {
			if (i != j) {
				sum = sum + array[i][j];
			}
		}
		System.out.println(sum);
	}

	// ��10������������
	// ��������ѡ�񷨣����Ӻ�9���ȽϹ����У�ѡ��һ����С�����һ��Ԫ�ؽ����� �´����ƣ����õڶ���Ԫ�����8�����бȽϣ������н�����
	public void tenNumSort() {
		int[] arr = new int[11];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(100) + 1;// �õ�10��100���ڵ�����
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\nPlease Input a int number: ");
		Scanner in = new Scanner(System.in);
		arr[10] = in.nextInt();// ������һ��intֵ
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	// ��100֮�ڵ�����
	public void allPrime(int n) {
		int j;
		for (int i = 2; i <= n; i++) {
			for (j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				}
			}
			// �����������һ��Ҳû�з�����i=Math.floor(Math.aqrt(i))+1,��֮�򲻴���Math.floor(Math.aqrt(i))
			if (j == Math.floor(Math.sqrt(i)) + 1) {
				System.out.println(i + "������");
			}
		}
	}

	// ��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	static int[] a = new int[5];
	static int[] b = new int[5];

	public void plalindrome() {
		boolean is = false;
		Scanner s = new Scanner(System.in);
		long l = s.nextLong();
		if (l > 99999 || l < 10000) {
			System.out.println("Input error, please input again!");
			l = s.nextLong();
		}
		for (int i = 4; i >= 0; i--) {
			a[i] = (int) (l / (long) Math.pow(10, i));
			l = (l % (long) Math.pow(10, i));
		}
		System.out.println();
		for (int i = 0, j = 0; i < 5; i++, j++) {
			b[j] = a[i];
		}
		// ������������ͬʱ����
		for (int i = 0, j = 4; i < 5; i++, j--) {
			if (a[i] != b[j]) {
				is = false;
				break;
			} else {
				is = true;
			}
		}
		if (is == false) {
			System.out.println("is not a Palindrom!");
		} else if (is == true) {
			System.out.println("is a Palindrom!");
		}
	}

	// ��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
	public void converse(long l) {
		String s = Long.toString(l);
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	// ��Ŀ�����9*9�ھ���
	public void nineplay() {
		int i = 0;
		int j = 0;
		for (i = 1; i <= 9; i++) {
			for (j = i; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();
		}
	}

	// ������������x,y,z���������������С���������
	public void numSort() {
		int i, j, k, x = 0;
		System.out.print("������������\n");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		j = input.nextInt();
		k = input.nextInt();
		if (i > j) {
			x = i;
			i = j;
			j = x;
		}
		if (i > k) {
			x = i;
			i = k;
			k = x;
		}
		if (j > k) {
			x = j;
			j = k;
			k = x;
		}
		System.out.println(i + ", " + j + ", " + k);
	}

	public void square1(int a) {
		if (Math.sqrt(a) == Math.floor(Math.sqrt(a))) {

		}
	}

	// ��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
	// 1.����������ؼ��Ǽ����ÿһ���ֵ��
	public void total2(int n) {
		String a = "2";
		String b = "";
		int d = 0;
		for (int i = 0; i < n; i++) {
			b = b + a;
			int c = Integer.parseInt(b);
			d = d + c;
			System.out.println(b);
		}
		System.out.println(d);
	}

	// ��������������m��n���������Լ������С��������
	// 1.�������������շ������
	// ���Լ��
	public int commonDivisor(int m, int n) {
		if (n < 0 || m < 0) {
			System.out.println("error!");
			return -1;
		}
		if (n == 0) {
			return m;
			// System.out.println("The biggest common divisor is:" + m);
		}
		return commonDivisor(n, m % n);
	}

	// ��С����������������˳������Լ��
	public void leastCommon(int a, int b) {
		int c = this.commonDivisor(a, b);
		System.out.println(c);
		System.out.println((a * b) / c);
	}

	// ������4�� ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
	// �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
	// (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
	// (2)���n <> k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������,�ظ�ִ�е�һ����
	// (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
	// HashSet res = new HashSet();
	ArrayList<Integer> res = new ArrayList<Integer>();

	public void fengjie(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + "*");
				fengjie(n / i);
			}
		}
		System.out.print(n);
		System.exit(0);/// ��������䣬�����������
	}

	public void shuixianhua2(int num) {
		int total = 0;// �ܺ�
		String res = Integer.toString(num);
		for (int i = 0; i < res.length(); i++) {
			// charת����
			char[] charArray = {};
			int num1 = Integer.parseInt(new String(charArray));
			// �˷�������char
			char m = res.charAt(i);
			System.out.println(m);
			total = total + (int) m;
		}

		System.out.println(total);
	}

	public static int base(int[] a) {
		// ����set����
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			set.add(a[i]);
		}
		// ����ת�ַ�
		int num = 99;
		String res = num + "";
		String res1 = String.valueOf(num);
		String res2 = Integer.toString(num);
		System.out.print(res2);
		// �ַ�ת����
		String x = "123";
		// int res = Integer.parseInt(x);
		int res4 = Integer.valueOf(x).intValue();
		// System.out.println(set);
		// ��ӡ����Ϊ�ַ���
		// Arrays.toString(a)
		return 1;
	}

	public void shuixianhua(int x) {
		System.out.println("sdafds".charAt(2));
		int i = 0, j = 0, k = 0;
		i = x / 100;
		j = (x % 100) / 10;
		k = x % 10;
		if (i * i * i + j * j * j + k * k * k == x)
			System.out.println("yes");
	}

	public void halfHigh2() {
		double s = 0;
		double t = 100;
		for (int i = 1; i <= 10; i++) {
			s += t;
			t = t / 2;
		}
		System.out.println(s);
		System.out.println(t);
	}

	public double halfHigh(double high, int n) {
		if (n == 0) {
			System.out.println(high);
			return high;
		}
		double res = high * 0.5;
		n = n - 1;
		return halfHigh(res, n);
	}

	public void wanShu() {
		int s;
		for (int i = 1; i < 1000; i++) {
			s = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0) {
					s = s + k;
				}
			}
			if (s == i) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}

	public boolean primeNum(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 1, 11, 21, 1211, 111221, ...
	public String countAndSay(int n) {
		StringBuilder curr = new StringBuilder("1");// 1
		StringBuilder prev;// ''
		int count;// ''
		char say;// ''
		for (int i = 1; i < n; i++) {// n=2
			prev = curr;// 1 1211
			curr = new StringBuilder();// ''
			count = 1;
			say = prev.charAt(0);// 1 1 2 1

			for (int j = 1, len = prev.length(); j < len; j++) {
				if (prev.charAt(j) != say) {
					if (len == 4) {
						System.out.println(say);
					}
					curr.append(count).append(say); // 11 1112
					count = 1;
					say = prev.charAt(j);// 2 1
				} else
					count++;// 1 3 2
			}
			curr.append(count).append(say);// 1131 111221
		}
		return curr.toString();// '11'

	}

	// All letters in this word are capitals, like "USA".
	// All letters in this word are not capitals, like "leetcode".
	// Only the first letter in this word is capital if it has more than one
	// letter, like "Google".
	public boolean detectCapitalUse(String word) {
		int x = word.length();
		int sum = 0;// ��д��ĸ�ĸ���
		for (int i = 0; i < x; i++) {
			char a = word.charAt(i);
			if (Character.isUpperCase(a)) {
				sum += 1;
			}
			// System.out.println(a);
		}
		if (sum == word.length() || sum == 0) {
			return true;
		}
		if (Character.isUpperCase(word.charAt(0)) && sum == 1) {
			return true;
		}
		return false;
	}

	public int oddEvenSubtract(int[] a) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < a.length; i++) {
			int j = a[i];// �����Ԫ��
			if (j % 2 == 0) {
			}
		}
		return oddSum - evenSum;
	}

	public int sum1s(int[] a) {
		// int[] x = new int[4];// ��ʼ������1����������
		// Set<Integer> x = new HashSet();
		int sum = 0;// ��ʼ��1�ĸ�����
		int max = -1;
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			if (j == 1) {
				sum += 1;
				if (sum > max) {
					max = sum;
				}
			} else if (j == 0) {
				if (sum > max) {
					max = sum;
				}
				System.out.println(sum);
				sum = 0;
			}
		}
		return max;
	}

	public int secondLarge(int[] a) {
		int max1 = -1;// ���ֵ
		int max2 = -1;// �ڶ����ֵ
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			// �ҳ����ֵ
			if (max1 < j) {
				max2 = max1;
				max1 = j;
			} else if (a[i] != max1 && max2 < a[i]) {
				max2 = a[i];
			}
		}
		return max2;
	}

	public boolean canWinNim(int n) {
		if (n % 4 == 0) {
			return false;
		}
		return true;
	}

	public int islandPerimeter(int[][] grid) {
		int sum = 0;
		for (int i = 0; i < grid.length; i++) {
			int[] js = grid[i];
			for (int j = 0; j < js.length; j++) {
				int m = js[j];
				if (m == 1) {
					sum += 4;
					if (j - 1 >= 0 && grid[i][j - 1] == 1) {
						sum -= 1;
					}
					if (j < grid[i].length - 1) {
						if (grid[i][j + 1] == 1) {
							sum -= 1;
						}
					}
					if (i - 1 >= 0 && grid[i - 1][j] == 1) {
						sum -= 1;
					}
					if (i < grid.length - 1 && grid[i + 1][j] == 1) {
						sum -= 1;
					}
				}
			}
		}
		System.out.println(sum);
		return 1;
	}

	public void solve(char[][] board) {
		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {
				char cs = board[i][j];
				if (cs == 'o') {
					board[i][j] = 'x';
				}
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}
}
