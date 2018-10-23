package com.qakeshav.javainterviewQuestion;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generating random integers using Random class
		Random random = new Random();

		for (int i = 0; i < 3; i++) {
			System.out.println("Random Integers:" + random.nextInt());
		}
		System.out.println("-----------------");

		for (int i = 0; i < 3; i++) {
			System.out.println("Random Doubles:" + random.nextDouble());
		}
		System.out.println("-----------------");

		for (int i = 0; i < 3; i++) {
			System.out.println("Random Boolean:" + random.nextBoolean());
		}
		System.out.println("-----------------");

		// Generating random doubles using Math.random()
		for (int i = 0; i < 3; i++) {
			System.out.println("Random Doubles Using Math:" + Math.random());
		}
		System.out.println("-----------------");

		//Generating random integers using ThreadLocalRandom class
		for (int i = 0; i < 3; i++) {
			System.out.println("Random Integers Using ThreadLocal:" + ThreadLocalRandom.current().nextInt());
		}
		System.out.println("-----------------");
	}

}