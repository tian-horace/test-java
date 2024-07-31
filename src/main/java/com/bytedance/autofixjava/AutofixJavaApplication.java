package com.bytedance.autofixjava;

import com.bytedance.autofixjava.utils.ArrayGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AutofixJavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(AutofixJavaApplication.class, args);
		System.out.println("hello world - autofix - java");
		int[][] arrays = ArrayGenerator.generateRandomTwoDArray(10, 10, 0, 100);
		System.out.println("生成的二维数组如下：");
		System.out.println(Arrays.deepToString(arrays));
	}
}
