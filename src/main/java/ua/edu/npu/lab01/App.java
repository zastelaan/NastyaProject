package ua.edu.npu.lab01;

import java.math.BigDecimal;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		System.out.println("class Detail: ");

		Detail someDetail = new Detail();
		Date currentDate = new Date();

		String DateOfManufacture = "2015-12-06";
		someDetail.setDateOfManufacture(DateOfManufacture);

		System.out.println("Age of the product is " + someDetail.getAgeOfProduct(currentDate) + " days");

		System.out.println("class Dog: ");

		Dog pug = new Dog();
		Dog sheperd = new Dog("Peter", 4);

		sheperd.voice();
		System.out.println(pug.getName());
		System.out.println(pug.getAge());

		System.out.println("class Statistic: ");

		int[] results = { 10, 19, 7, 8, 10 };

		Statistic test = new Statistic("SomeName", results);

		test.addSomeValue(77);

		int max = test.getMaxResult();
		int min = test.getMinResult();
		System.out.println("Max/Min are " + max + " / " + min);

		BigDecimal average = test.getAverageResult();
		System.out.println("Average is " + average);

		int mode = test.getModeOfResults();
		if (mode == 0) {
			System.out.println("There is any mode in reults!");
		} else {
			System.out.println("Mode is " + mode);
		}

		double median = test.getMedianOfResults();
		System.out.println("Median is " + median);

		int numOfResBiggerThanAver = test.getNumOfResBiggerThanAver();
		int numOfResSmallerThanAver = test.getNumOfResSmallerThanAver();
		System.out.println("Number of results bigger/smaller than average are " + numOfResBiggerThanAver + " / "
				+ numOfResSmallerThanAver);
	}

}
