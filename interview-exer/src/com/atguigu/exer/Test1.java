package com.atguigu.exer;

import org.junit.Test;

public class Test1 {
	
	//题目1：一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值。
	@Test	
	public void test01() {
		int[] arr = new int[] {4,26,12,87,-8,87};
		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arr[i] / arr[0];
//		}
		for (int i = arr.length -1; i >= 0; i--) {
			arr[i] = arr[i] / arr[0];
		}
		//遍历arr
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//1 26 12 87 -8 87 
										 //1 6 3 21 -2 21 --从后往前开始除，是数组的第一个元素没有改变
		}
	}
	//2.金额转换，阿拉伯数字的的金额转换成中国传统的形式。如：105600123 => 壹亿零仟伍佰陆拾零万仟佰贰拾圆整
	@Test
	public void test02() throws Exception {
		
	}
	//3.创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
}
