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
//	Java����һ��Arrays�࣬ר����������array�� 
//	Arrays��ӵ��һ��static������ 
//	- equals()���Ƚ�����array�Ƿ���ȡ�arrayӵ����ͬԪ�ظ����������ж�ӦԪ��������ȡ� 
//	- fill()����ֵ����array�С� 
//	- sort()��������array�������� 
//	- binarySearch()�����ź����array��Ѱ��Ԫ�ء� 
//	- System.arraycopy()��array�ĸ��ơ�
}
