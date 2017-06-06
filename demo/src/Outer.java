public class Outer {
	private int size;

	public class Inner {
		private int counter = 10;

		public void doStuff() {
			// System.out.println(++size);
			size++;
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.doStuff();
		System.out.println(outer.size);
		System.out.println(inner.counter);
		// 编译错误，外部类不能访问内部类的变量
		// System.out.println(counter);
	}
}
