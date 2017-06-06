package algorithm;

import java.util.Arrays;

public class MyArray {
	//数组
	private long[] arr;
	//数组中有效数据的大小
	private int elems=0;
	//默认构造函数
	public MyArray(){
		this(50);//调用自己的构造函数
	}
	public MyArray(int max){
		arr = new long[max];
	}
	//插入数据
	public void insert(long value){
		arr[elems] = value;
		elems++;
	}
	//排序插入数据
	public void insertSort(long value){
		int j=0;
		for ( j = 0; j < elems; j++) {
			long l = arr[j];
			if (l>value) {
				break;
			}
		}
		if (j== elems) {
			arr[elems] = value;
		} else{
			//数组前个元素向后移动要从后向前循环，而后个元素向前移动要从前向后循环
			for (int i = elems; i > j; i--) {
				arr[i] = arr[i-1];
			}
			arr[j] = value;
		}
		elems++ ;
	}
	//显示数据
	public void display(){
		for (int i = 0; i < elems; i++) {
			long l = arr[i];
			System.out.println(l);
		}
	}
	//查找数据
	public int find(long key){
		int j;
		for ( j = 0; j < elems; j++) {
			if (arr[j] == key) {
				break;
			}
		}
		if (j==elems) {
			return -1;
		}else{
			return j;
		}
	}
	//刪除數據
	public boolean delete(long key){
		if (find(key) == -1) {
			return false;
		} else {
			for (int i = find(key); i < elems; i++) {
				arr[i] = arr[i+1];
				
			}
			return true;
		}
	}
	//修改數據
	public void change(long oddValue,long newValue){
		if (find(oddValue) == -1) {
			System.out.println("查找不到指定數據,修改失敗");
		} else {
			arr[find(oddValue)] = newValue;
		}
	}
	public int[] sort(int x){
		int[] initArr = {1,3,5,7};//已经排好顺序的
		for (int i = 0; i < initArr.length; i++) {
			if (initArr[i]>x) {
				for (int j = i; j < initArr.length; j++) {
					initArr[j+1] = initArr[j];
				}
			}
			initArr[i] = x;
		}
		return initArr;
	}
}
