package com.hyq.algorithm;

/**
 * 希尔排序:是插入排序的一种又称“缩小增量排序”（Diminishing Increment
 * Sort），是直接插入排序算法的一种更高效的改进版本。希尔排序是非稳定排序算法。该方法因D.L.Shell于1959年提出而得名。
 *
 * 平均时间复杂度：n^1.3 ，最好时间复杂度：n^2， 最坏时间复杂度：n^2，空间复杂度：1
 *
 * 稳定性： 不稳
 *
 * @author hyq
 * @version 1.0.0
 * @date 2020-05-09
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 5, 3, 6, 2, 7, 9, 1, 8 };

		printArray(arr);

		// 数组长度
		int length = arr.length;

		// Knuth序列
		int h = 1;
		while (h <= length / 3) {
			h = h * 3 + 1;
		}

		// 间隔 gap
		for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
			for (int i = gap; i < length; i++) {
				for (int j = i; j > gap - 1; j -= gap) {
					if (arr[j] < arr[j - gap]) {
						swapValue(arr, j, j - gap);
					}
				}
			}
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
