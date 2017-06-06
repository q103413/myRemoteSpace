package algorithm;

import java.util.*;

//������
public class ArraySort {
	// ���������������е������㷨���ڴ��������£��������������ģ�ִ��ʱ����O(N*logN)����
	// �����ǿ�������ĸ�������,���չؼ��ְ����ݷ�Ϊ����
	private int partitionIt(int[] arr, int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while (true) {
			while (leftPtr < right && arr[++leftPtr] < pivot)
			 if (1==2);			 
		}
	}

	// ϣ������ϣ��������Ƕ�ֱ�Ӳ��������һ���Ż���
	public int[] shellSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return null;
		}
		// ����
		int incrementNum = arr.length / 2;
		while (incrementNum >= 1) {
			for (int i = 0; i < arr.length; i++) {
				// ���в�������
				for (int j = i; j < arr.length - incrementNum; j = j + incrementNum) {
					if (arr[j] > arr[j + incrementNum]) {
						int temple = arr[j];
						arr[j] = arr[j + incrementNum];
						arr[j + incrementNum] = temple;
					}
				}
			}
			// �����µ�����
			incrementNum = incrementNum / 2;
		}
		return arr;
	}

	// �鲢����ȼ�����Ҫ��Ч�Ķ࣬ԭ���Ǻϲ���������������鵽һ�����飺
	private void merge(int[] arrA, int[] arrB, int[] arrC) {
		int aDex = 0, bDex = 0, cDex = 0;
		int sizeA = arrA.length;
		int sizeB = arrB.length;
		// A���M��B���M�������
		while (aDex < sizeA && bDex < sizeB) {
			if (arrA[aDex] < arrB[bDex]) {
				arrC[cDex++] = arrA[aDex++];
			} else {
				arrC[cDex++] = arrB[bDex++];
			}
		}
		// A���M����գ�B���M���
		while (aDex < sizeA) {
			arrC[cDex++] = arrA[aDex++];
		}
		// A���M��գ�B���M�����
		while (bDex < sizeB) {
			arrC[cDex++] = arrB[bDex++];
		}
	}

	// Ԕ�����������a����
	class MergeSort {
		public void merge(int[] a, int low, int mid, int high) {
			int[] temp = new int[high - low + 1];
			int i = low;// ��ָ�
			int j = mid + 1;// ��ָ�
			int k = 0;// workSpace's index
			// ���^С�Ĕ����Ƶ����M��
			while (i <= mid && j <= high) {
				if (a[i] < a[j]) {
					temp[k++] = a[i++];
				} else {
					temp[k++] = a[j++];
				}
			}
			// ����߅ʣ�N�Ĕ����딵�M
			while (i <= mid) {
				temp[k++] = a[i++];
			}
			// ����߅ʣ�N�Ĕ����딵�M
			while (j <= high) {
				temp[k++] = a[j++];
			}
			// �����M�еĔ����wԭ���M
			for (int k2 = 0; k2 < temp.length; k2++) {
				a[k2 + low] = temp[k2];
			}
		}

		public void mergeSort(int[] a, int low, int high) {
			int mid = (low + high) / 2;
			if (low < high) {
				// ��߅
				mergeSort(a, low, mid);
				// ��߅
				mergeSort(a, mid + 1, high);
				// ���Қw��
				merge(a, low, mid, high);
				System.out.println(Arrays.toString(a));
			}
		}
	}

	// ð����������
	public int[] bubbleSort(int[] arr) {
		for (int i = arr.length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	// �������򣬣����Oǰ����������ɺ���ǰѭ�h�����뵽���m��λ��
	// ����������һ������£���ð�������һ������ѡ�������һ�㡣
	public int[] insertSort(int[] arr) {
		int i, j;
		int target;
		// �ٶ���һ��Ԫ�ر��ŵ�����ȷ��λ����
		for (i = 1; i < arr.length; i++) {
			j = i;
			target = arr[i];
			while (j > 0 && target < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = target;
		}
		return arr;
	}

	// �x���������ѡ��һ����С�ķ���ǰ��
	public int[] selectionSort(int[] a) {
		if (a == null || a.length <= 0) {
			return null;
		}
		for (int i = 0; i < a.length; i++) {
			int min = i;// ����ǰ�±궨��Ϊ��Сֵ�±�
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) {// ��min�����i���f���ҵ���С��ֵ�����Q
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
		return a;
	}

	// ���ַ����ң��ֽ��۰���ң�Ҫ������ҵ���������
	// �ǵݹ����
	public int binaryFind(int[] arr, int a) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (arr[mid] == a) {
				return mid;
			} else if (arr[mid] < a) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;
	}

	public int binaryFindRecursion(int[] arr, int a, int lo, int hi) {
		if (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (a == arr[mid]) {
				return mid;
			} else if (a > arr[mid]) {
				return binaryFindRecursion(arr, a, mid + 1, hi);
			} else {
				return binaryFindRecursion(arr, a, lo, mid - 1);
			}
		}
		return -1;
	}

	// System.arraycopy(src, srcPos, dest, destPos, length)
	// src:Ҫ������Դ����</span>
	// srcPos:ҪԴ�������ʼλ�ã���0����
	// dest:Ҫ��������Ŀ������
	// destPos:Ŀ���������ʼλ��
	// length:��Ҫ�����ĳ���</p>
	public void arrCopy() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 1, 1, 1 };
		Class c = a.getClass();
		System.out.println(c.isArray());
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(Arrays.toString(b));
	}
}
