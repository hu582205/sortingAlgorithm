package com.hyq.algorithm;

/**
 * 选择排序： 第一次从待排序的数据元素中选出最小（或最大）的一个元素， 存放在序列的起始位置，然后再从剩余的未排序元素中寻找到最小（大）元素，
 * 然后放到已排序的序列的末尾。以此类推，直到全部待排序的数据元素的个数为零。选择排序是不稳定的排序方法。
 *
 * 平均时间复杂度：n^2 ，最好时间复杂度：n^2， 最坏时间复杂度：n^2，空间复杂度：1
 *
 * 稳定性：不稳
 *
 * @author hyq
 * @version 1.0.0
 * @date 2020-05-09
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 5, 3, 6, 2, 7, 9, 1, 8 };

		printArray(arr);

		// 数组长度
		int length = arr.length;

		// 只用循环 length -1 次
		for (int i = 0; i < length - 1; i++) {
			// 从第一个开始比较与后面的数据比较
			int minPos = i;
			// 交换下标： 将第i个元素和后面的数组作比较，最小的值下标赋值个minPos,
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[minPos]) {
					minPos = j;
				}
			}
			System.out.println("第" + (i + 1) + "最小值下标：" + minPos);

			swapValue(arr, i, minPos);

			printArray(arr);
		}

	}

	/**
	 * 交换属性
	 *
	 * @param arr
	 *            数组
	 * @param i
	 *            初始值下标
	 * @param j
	 *            被交换值下标
	 * @return
	 * @author hyq
	 */
	private static void swapValue(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
