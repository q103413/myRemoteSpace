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
		// 数组去重
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
			int one = re.next();// 重点：一个迭代器里面只能有一个it.next
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

	// 题目：求一个3*3矩阵对角线元素之和
	// 1.程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
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

	// 对10个数进行排序
	// 可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换， 下次类推，即用第二个元素与后8个进行比较，并进行交换。
	public void tenNumSort() {
		int[] arr = new int[11];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(100) + 1;// 得到10个100以内的整数
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\nPlease Input a int number: ");
		Scanner in = new Scanner(System.in);
		arr[10] = in.nextInt();// 输入下一个int值
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	// 求100之内的素数
	public void allPrime(int n) {
		int j;
		for (int i = 2; i <= n; i++) {
			for (j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				}
			}
			// 如果以上条件一次也没有发生，i=Math.floor(Math.aqrt(i))+1,反之则不大于Math.floor(Math.aqrt(i))
			if (j == Math.floor(Math.sqrt(i)) + 1) {
				System.out.println(i + "是质数");
			}
		}
	}

	// 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
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
		// 两个参数条件同时进行
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

	// 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
	public void converse(long l) {
		String s = Long.toString(l);
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	// 题目：输出9*9口诀。
	public void nineplay() {
		int i = 0;
		int j = 0;
		for (i = 1; i <= 9; i++) {
			for (j = i; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();
		}
	}

	// 输入三个整数x,y,z，请把这三个数由小到大输出。
	public void numSort() {
		int i, j, k, x = 0;
		System.out.print("请输入三个数\n");
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

	// 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
	// 1.程序分析：关键是计算出每一项的值。
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

	// 输入两个正整数m和n，求其最大公约数和最小公倍数。
	// 1.程序分析：利用辗除法。
	// 最大公约数
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

	// 最小公倍数等于两数相乘除以最大公约数
	public void leastCommon(int a, int b) {
		int c = this.commonDivisor(a, b);
		System.out.println(c);
		System.out.println((a * b) / c);
	}

	// 【程序4】 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
	// 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
	// (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
	// (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你,重复执行第一步。
	// (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
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
		System.exit(0);/// 不能少这句，否则结果会出错
	}

	public void shuixianhua2(int num) {
		int total = 0;// 总和
		String res = Integer.toString(num);
		for (int i = 0; i < res.length(); i++) {
			// char转整型
			char[] charArray = {};
			int num1 = Integer.parseInt(new String(charArray));
			// 此方法不行char
			char m = res.charAt(i);
			System.out.println(m);
			total = total + (int) m;
		}

		System.out.println(total);
	}

	public static int base(int[] a) {
		// 定义set类型
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			set.add(a[i]);
		}
		// 整型转字符
		int num = 99;
		String res = num + "";
		String res1 = String.valueOf(num);
		String res2 = Integer.toString(num);
		System.out.print(res2);
		// 字符转整型
		String x = "123";
		// int res = Integer.parseInt(x);
		int res4 = Integer.valueOf(x).intValue();
		// System.out.println(set);
		// 打印数组为字符串
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
		int sum = 0;// 大写字母的个数
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
			int j = a[i];// 数组的元素
			if (j % 2 == 0) {
			}
		}
		return oddSum - evenSum;
	}

	public int sum1s(int[] a) {
		// int[] x = new int[4];// 初始化放入1个数的数组
		// Set<Integer> x = new HashSet();
		int sum = 0;// 初始化1的个数；
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
		int max1 = -1;// 最大值
		int max2 = -1;// 第二大的值
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			// 找出最大值
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
