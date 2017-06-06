package algorithm;
import java.util.*;

import algorithm.ArraySort.MergeSort;
public class TestAlgorithm {
	private static int aa;
	public static void main(String[] args) {
		try {
//			TestLink link = new TestLink();
//			Date date = new Date();
//			System.out.println(date.getTime());
//			MyArray ma = new MyArray();
//			Recurrence rc = new Recurrence();
//			ArraySort as = new ArraySort(); 
//	        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
//	        System.out.println( Arrays.toString( as.shellSort(a) )  );
	        int i = 2;
//	        while(i<22);
	        if (1==1) 
				System.out.println(i++);
	        
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void test1(){
		System.out.println(aa);
	}
	public void test0(int i){
		System.out.println("before"+i);
		if (i<100) {
			i++;
			test0(i);
		} 
		if (i==100) {
			i++;
			System.out.print("after"+i);
			i++;
		}
	}
}
