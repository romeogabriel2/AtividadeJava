package br.com.objetos;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		// cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// solicita e insere três valores de ponto flutuante
		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble(); // lê o primeiro double
		double number2 = input.nextDouble(); // lê o segundo double
		double number3 = input.nextDouble(); // lê o terceiro double

		// determina o valor máximo
		double result = maximum(number1, number2, number3);

		// exibe o valor máximo
		System.out.println("Maximum is: " + result);
	}
	//retorna o máximo dos seus três parametros de double
	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		
		//determina se y é maior que maximumValue
		if (y > maximumValue)
			maximumValue = z;
		
		//determina se z é maior que maximumValue
		if (z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
	}
}
