package com.atguigu.exer;

//题目1：一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值。
public class Test1 {
	
	public static void main(String[] args) {
		
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
}
