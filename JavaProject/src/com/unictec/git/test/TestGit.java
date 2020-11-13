package com.unictec.git.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestGit {

	public static void main(String[] args)
	{

		List<Integer> a = Arrays.asList(1, 2, 3);
		List<Integer> b = Arrays.asList(4, 5);
		List<Integer> c = Arrays.asList(7, 8, 9);
		
		List<List<Integer>> listOfListofInts = Arrays.asList(a, b, c);
		System.out.println("Before flattening : " + listOfListofInts);
		System.out.println("b");
		List<Integer> listofInts = listOfListofInts.parallelStream()
				                        .flatMap(list -> list.parallelStream())
				                        	.collect(Collectors.toList());
		
		System.out.println("After flattening : " + listofInts);
		
		
		
	}

}
