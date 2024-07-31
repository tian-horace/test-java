package com.bytedance.autofixjava;

import com.bytedance.autofixjava.utils.ArrayGenerator;

import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("hello world - autofix - java");
		int[][] arrays = ArrayGenerator.generateRandomTwoDArray(10, 10, 0, 100);
		System.out.println("生成的二维数组如下：");
		System.out.println(Arrays.deepToString(arrays));
	}
}
