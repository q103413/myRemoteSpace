package basicKnowledge;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {10,20,30,40,50};
		System.out.println(a.equals(b));
//		Arrays.fill(a,0,a.length-2, (int)(100*Math.random() ) );
		System.out.println( Arrays.toString(a) );
		System.out.println( Arrays.binarySearch(a, 4) );
//		System.arraycopy(/**/, srcPos, dest, destPos, length);
	}
//	Java中有一个Arrays类，专门用来操作array。 
//	Arrays中拥有一组static函数， 
//	- equals()：比较两个array是否相等。array拥有相同元素个数，且所有对应元素两两相等。 
//	- fill()：将值填入array中。 
//	- sort()：用来对array进行排序。 
//	- binarySearch()：在排好序的array中寻找元素。 
//	- System.arraycopy()：array的复制。
}
