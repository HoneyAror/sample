package com.example.demo;
//spring manages creation of bean and its dependency
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  //scan package and sub packages for bean
public class DemoApplication {
	public static void main(String[] args) {
		//beans are objects
		//here SortingAlgorithm is a dependency for binarysearchimp
		//BinarySearchimpl b=new BinarySearchimpl(new BubblesortingAlgo());
		//ApplicationContext stores & manage beans
		ApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);
		BinarySearchimpl b=applicationContext.getBean(BinarySearchimpl.class);
		int result=b.binarysearch(new int[] {12,6,7},3 );
		System.out.println(result);
	}
}
