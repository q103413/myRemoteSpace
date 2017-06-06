package algorithm;

import java.util.*;

//工具类
public class ArraySort {
	// 快速排序是最流行的排序算法，在大多数情况下，快速排序都是最快的，执行时间是O(N*logN)级。
	// 划分是快速排序的根本机制,按照关键字把数据分为两组
	private int partitionIt(int[] arr, int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while (true) {
			while (leftPtr < right && arr[++leftPtr] < pivot)
			 if (1==2);			 
		}
	}

	// 希爾排序，希尔排序就是对直接插入排序的一个优化。
	public int[] shellSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return null;
		}
		// 增量
		int incrementNum = arr.length / 2;
		while (incrementNum >= 1) {
			for (int i = 0; i < arr.length; i++) {
				// 进行插入排序
				for (int j = i; j < arr.length - incrementNum; j = j + incrementNum) {
					if (arr[j] > arr[j + incrementNum]) {
						int temple = arr[j];
						arr[j] = arr[j + incrementNum];
						arr[j + incrementNum] = temple;
					}
				}
			}
			// 设置新的增量
			incrementNum = incrementNum / 2;
		}
		return arr;
	}

	// 归并排序比简单排序要有效的多，原理是合并两个已排序的数组到一个数组：
	private void merge(int[] arrA, int[] arrB, int[] arrC) {
		int aDex = 0, bDex = 0, cDex = 0;
		int sizeA = arrA.length;
		int sizeB = arrB.length;
		// A數組和B數組都不為空
		while (aDex < sizeA && bDex < sizeB) {
			if (arrA[aDex] < arrB[bDex]) {
				arrC[cDex++] = arrA[aDex++];
			} else {
				arrC[cDex++] = arrB[bDex++];
			}
		}
		// A數組不為空，B數組為空
		while (aDex < sizeA) {
			arrC[cDex++] = arrA[aDex++];
		}
		// A數組為空，B數組不為空
		while (bDex < sizeB) {
			arrC[cDex++] = arrB[bDex++];
		}
	}

	// 詳細的完整代碼如下
	class MergeSort {
		public void merge(int[] a, int low, int mid, int high) {
			int[] temp = new int[high - low + 1];
			int i = low;// 左指針
			int j = mid + 1;// 右指針
			int k = 0;// workSpace's index
			// 把較小的數先移到新數組中
			while (i <= mid && j <= high) {
				if (a[i] < a[j]) {
					temp[k++] = a[i++];
				} else {
					temp[k++] = a[j++];
				}
			}
			// 把左邊剩餘的數移入數組
			while (i <= mid) {
				temp[k++] = a[i++];
			}
			// 把右邊剩餘的數移入數組
			while (j <= high) {
				temp[k++] = a[j++];
			}
			// 把新數組中的數覆蓋原數組
			for (int k2 = 0; k2 < temp.length; k2++) {
				a[k2 + low] = temp[k2];
			}
		}

		public void mergeSort(int[] a, int low, int high) {
			int mid = (low + high) / 2;
			if (low < high) {
				// 左邊
				mergeSort(a, low, mid);
				// 右邊
				mergeSort(a, mid + 1, high);
				// 左右歸併
				merge(a, low, mid, high);
				System.out.println(Arrays.toString(a));
			}
		}
	}

	// 冒泡排序，最慢
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

	// 插入排序，，假設前面的已排序，由后向前循環，插入到合適的位置
	// 插入排序，在一般情况下，比冒泡排序快一倍，比选择排序快一点。
	public int[] insertSort(int[] arr) {
		int i, j;
		int target;
		// 假定第一个元素被放到了正确的位置上
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

	// 選擇排序，向后选择一个最小的放在前面
	public int[] selectionSort(int[] a) {
		if (a == null || a.length <= 0) {
			return null;
		}
		for (int i = 0; i < a.length; i++) {
			int min = i;// 将当前下标定义为最小值下标
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) {// 若min不等於i，說明找到最小的值，交換
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
		return a;
	}

	// 二分法查找，又叫折半查找，要求待查找的序列有序。
	// 非递归代码
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
	// src:要拷贝的源数组</span>
	// srcPos:要源数组的起始位置，从0算起
	// dest:要拷贝到的目的数组
	// destPos:目的数组的起始位置
	// length:需要拷贝的长度</p>
	public void arrCopy() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 1, 1, 1 };
		Class c = a.getClass();
		System.out.println(c.isArray());
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(Arrays.toString(b));
	}
}
