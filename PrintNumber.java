package com.hsbc.test;

public class PrintNumber {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	public static void test1(){
		for(int i = 1; i <= 100; i++){
			if(i % 3 ==0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}else if (i % 3 ==0 ){
				System.out.println("Fizz");
			}else if (i % 5 ==0 ){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}
	
	public static void test2(){
		for(int i = 1; i <= 100; i++){
				if((i % 3 ==0 && i % 5 == 0) || (i == 53 || i == 35 )){
					System.out.println("FizzBuzz");
				}else if (i % 3 ==0 || i % 10 == 3 || i /10 ==3){
					System.out.println("Fizz");
				}else if (i % 5 ==0 || i % 10 == 5 || i /10 ==5){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}	
			
		}
	}

}
