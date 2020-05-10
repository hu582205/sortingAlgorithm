package com.hyq.algorithm;

/**
 * 冒泡排序：这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端（升序或降序排列），就如同碳酸饮料中二氧化碳的气泡最终会上浮到顶端一样，故名“冒泡排序”。
 *
 *  平均时间复杂度：n^2 ，最好时间复杂度：n， 最坏时间复杂度：n^2，空间复杂度：1
 *
 *  稳定性： 稳
 * @author hyq
 * @version 1.0.0
 * @date 2020-05-09
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 5, 3, 6, 2, 7, 9, 1, 8 };

		printArray(arr);

		// 数组长度
		int length = arr.length;

		// 只用循环 length -1 次
		for (int i = length - 1; i > 0; i--) {
			// 每次比较从第一个开始，一次向后比较
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swapValue(arr, j, j + 1);
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
