package algorithm;

import java.util.Arrays;

public class MyArray {
	//����
	private long[] arr;
	//��������Ч���ݵĴ�С
	private int elems=0;
	//Ĭ�Ϲ��캯��
	public MyArray(){
		this(50);//�����Լ��Ĺ��캯��
	}
	public MyArray(int max){
		arr = new long[max];
	}
	//��������
	public void insert(long value){
		arr[elems] = value;
		elems++;
	}
	//�����������
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
			//����ǰ��Ԫ������ƶ�Ҫ�Ӻ���ǰѭ���������Ԫ����ǰ�ƶ�Ҫ��ǰ���ѭ��
			for (int i = elems; i > j; i--) {
				arr[i] = arr[i-1];
			}
			arr[j] = value;
		}
		elems++ ;
	}
	//��ʾ����
	public void display(){
		for (int i = 0; i < elems; i++) {
			long l = arr[i];
			System.out.println(l);
		}
	}
	//��������
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
	//�h������
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
	//�޸Ĕ���
	public void change(long oddValue,long newValue){
		if (find(oddValue) == -1) {
			System.out.println("���Ҳ���ָ������,�޸�ʧ��");
		} else {
			arr[find(oddValue)] = newValue;
		}
	}
	public int[] sort(int x){
		int[] initArr = {1,3,5,7};//�Ѿ��ź�˳���
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
