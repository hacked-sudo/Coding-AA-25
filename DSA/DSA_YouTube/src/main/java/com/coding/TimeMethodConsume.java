package com.coding;

public class TimeMethodConsume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		double startTime = System.currentTimeMillis();
		TimeMethodConsume object = new TimeMethodConsume();
		System.out.println(object.findSum(999999999L));
		
		double endTime = System.currentTimeMillis();
		
		System.out.println((endTime-startTime)/1000);
		

	}
	
//	public long findSum(long num) {
//		long sum = 0;
//		
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		return sum;
//	}
	
	public long findSum(long num) {
		return (num * (num + 1))/2;
	}
}
