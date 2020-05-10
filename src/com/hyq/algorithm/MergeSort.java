package com.hyq.algorithm;

/**
 * 归并排序:是建立在归并操作上的一种有效的排序算法,该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
 * 若将两个有序表合并成一个有序表，称为二路归并。归并排序是一种稳定的排序方法。
 * 
 * 平均时间复杂度：n*log2*n ，最好时间复杂度：n*log2*n， 最坏时间复杂度：n*log2*n，空间复杂度：n
 * 
 * 稳定性：稳
 *
 * @author hyq
 * @version 1.0.0
 * @date 2020-05-09
 */
public class MergeSort {

	private static final int test = 0;

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 8, 11, 2, 4, 6, 9 };

		MergeSort.printArray(arr);
		MergeSort.sort(arr, 0, arr.length - 1);

		MergeSort.printArray(arr);
	}

	/**
	 * 排序
	 *
	 * @param arr
	 *            数组
	 * @param begin
	 *            数组开始下标
	 * @param end
	 *            数组结束下标
	 */
	private static void sort(int[] arr, int begin, int end) {
		if (begin == end) {
			return;
		}
		// 中间位置
		int mid = begin + (end - begin) / 2;
		// 右边数组开始指针
		int rightPos = mid + 1;
		// 左边数组排序
		MergeSort.sort(arr, begin, mid);
		// 右边右边排序
		MergeSort.sort(arr, rightPos, end);

		MergeSort.mergeSort(arr, begin, rightPos, end);

	}

	/**
	 * 归并排序
	 *
	 * @param arr
	 *            数组
	 * @param leftPos
	 *            左边指针
	 * @param rightPos
	 *            右边指针
	 * @param rightBound
	 *            数组长度
	 * @return {@link int[]}
	 */
	private static void mergeSort(int[] arr, int leftPos, int rightPos, int rightBound) {
		// 数组长度
		int length = rightBound - leftPos + 1;

		// 中间位置下标值
		int mid = rightPos - 1;

		int[] temp = new int[length];

		// 左边数组指针
		int i = leftPos;

		// 右边数组指针
		int j = rightPos;

		// 新数组指针
		int k = 0;

		while (i <= mid && j <= rightBound) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		// 处理比对完成后不需比对的数据
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= rightBound) {
			temp[k++] = arr[j++];
		}

		for (int l = 0; l < temp.length; l++) {
			arr[leftPos + l] = temp[l];
		}
	}

	/**
	 * 打印数组
	 *
	 * @param arr
	 *            加勒比海盗
	 * @return
	 * @author hyq
	 */
	private static void printArray(int[] arr) {
		System.out.println("数组值：");
		for (int m = 0; m < arr.length; m++) {
			System.out.print(arr[m] + "  ");
		}
		System.out.println("");
	}

}
