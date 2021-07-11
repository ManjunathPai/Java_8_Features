package com.yadyapi.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author paimanjunathn
 *
 */
public class MatchFunctionalityExample {

	public static void main(String[] args) {

		// anyMatch Example 
		List<Integer> myNumberList = Arrays.asList(3, 8, 5, 6, 2, 9);
		List<String> myStringList = Arrays.asList("Richie", "Ram", "Manju", "Harry", "Chanmeet", "Chandler");
		//Example 1
		System.out.println("Does myNumberList.stream().anyMatch(num->num%3==0) satisfy the condition ? " + myNumberList.stream().anyMatch(num -> num % 3 == 0));
		//Example 2
		System.out.println("Does stream().anyMatch(s->s.startsWith(\"N\")) satisfy the condition ? " + myStringList.stream().anyMatch(s -> s.startsWith("N")));
		//Example 3
		System.out.println("Does stream().anyMatch(s->s.startsWith(\"R\")) satisfy the condition ? " + myStringList.stream().anyMatch(s -> s.startsWith("R")));
		
		// All Match Example
		List<Integer> myNumberList2 = Arrays.asList(3, 8, 5, 6, 2, 9);
		List<Integer> myNumberList4 = Arrays.asList(6, 9, 12, 15, 18);
		List<String> myStringList2 = Arrays.asList("Richie", "Ram", "Manju", "Harry", "Chanmeet", "Chandler");
		//Example 1
		System.out.println("Does myNumberList satisfy the condition n->n%3==0 ?" + myNumberList2.stream().allMatch(n -> n % 3 == 0));
		//Example 2
		System.out.println("Does myNumberList satisfy the condition n->n%3==0 ?" + myNumberList4.stream().allMatch(n -> n % 3 == 0));
		//Example 3
		System.out.println("Does myNumberList satisfy the condition s.length()>5 ?" + myStringList2.stream().allMatch(s -> s.length() > 5));
		//Example 4
		System.out.println("Does myNumberList satisfy the condition s.length()>2 ?" + myStringList2.stream().allMatch(s -> s.length() > 2));
		
		//None Match
		List<Integer> myNumberList5 = Arrays.asList(2,4,6,8);
		//Example 1
		System.out.println("myNumberList.stream().noneMatch(n->n%3==0) ?" + myNumberList5.stream().noneMatch(n->n%3==0));
		//Example 2
		System.out.println("myNumberList.stream().noneMatch(n->n%2==0) ?" + myNumberList5.stream().noneMatch(n->n%5==0));
		}
}
