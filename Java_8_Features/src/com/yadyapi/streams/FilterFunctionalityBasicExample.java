package com.yadyapi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author paimanjunathn
 *
 */
public class FilterFunctionalityBasicExample {
	public static void main(String[] args) {
		List<String> movieStrings=Arrays.asList("Mission Impossible","Cast Away","The Terminal","sully");
		System.out.println("**************Movie names having length more than 10*******************");
		movieStrings.stream().filter(s->s.length()>10).forEach((s)->System.out.println(s));
		System.out.println("**************Movie names having starting lower letter*******************");
		movieStrings.stream().filter(s->Character.isLowerCase(s.charAt(0))).forEach(System.out::println);
		System.out.println("**************Movie names having upper case letter at index 6*******************");
		movieStrings.stream().filter(s->s.length()>6).filter(s->Character.isUpperCase(s.charAt(5))).forEach(System.out::println);
		
		List<Integer> numList=Arrays.asList(3,5,10,8,16,15,67,25);
		System.out.println("**************Elements divisible by 5*******************");
		numList.stream().filter(n->n%5==0).forEach(System.out::println);
	}
}
