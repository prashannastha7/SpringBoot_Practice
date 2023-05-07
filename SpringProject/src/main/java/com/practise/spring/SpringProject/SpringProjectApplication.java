package com.practise.spring.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
//yo garnu pardaina becoz Sb le automatically search garcha beans Application Context banaunu parcha
		//BinarySearchImpl binarySearch =
		//new BinarySearchImpl(new BubbleSortAlgo());
		// To make Quicksort run write (new QuickSortAlgo());

//Application Context code to pick up the beam form app context and use to exe binarysear
		ApplicationContext applicationContext =
				SpringApplication.run(SpringProjectApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result =
				binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
               System.out.println(result);
	}
}
