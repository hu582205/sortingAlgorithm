package com.hyq.algorithm;

/**
 * 插入排序，一般也被称为直接插入排序。对于少量元素的排序，它是一个有效的算法。
 * 插入排序是一种最简单的排序方法，它的基本思想是将一个记录插入到已经排好序的有序表中，从而一个新的、记录数增1的有序表。
 * 在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动
 * 
 * 平均时间复杂度：n^2 ，最好时间复杂度：n， 最坏时间复杂度：n^2，空间复杂度：1
 *
 * 稳定性：稳
 * 
 * @author hyq
 * @version 1.0.0
 * @date 2020-05-09
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 5, 3, 6, 2, 7, 9, 1, 8 };

		printArray(arr);

		// 数组长度
		int length = arr.length;

		for (int i = 1; i < length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swapValue(arr, j, j - 1);
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
