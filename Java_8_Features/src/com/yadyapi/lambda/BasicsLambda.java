package com.yadyapi.lambda;

/**
 * @author paimanjunathn
 *
 */
public class BasicsLambda {

	public static void main(String[] args) {
		// Without any parameter
		NoParameterExample aNoParameterExample = () -> System.out.println("No Parameter Example");
		aNoParameterExample.noParam();

		// With parameter Example
		WithParameterExample aWithParameterExample = (int x, int y) -> x + y;
		System.out.println("Sum is " + aWithParameterExample.sum(3, 6));

	}

	interface NoParameterExample {
		void noParam();
	}

	interface WithParameterExample {
		int sum(int i, int j);
	}

}
