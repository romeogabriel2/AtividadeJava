package br.com.objetos;
//Resolvendo o problema da média da classe usando a repetição controlada por sentinela

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// cria scanner para obter entrada a partir da janela de comando
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// fase de inicialização
		int total = 0; // inicializa a soma das notas
		int gradeCounter = 0; // inicializa o numero de notas inseridas até agora

		// fase de processamento
		// solicita entrada e lê a nota do usuário
		System.out.print("Entr grade or -1 to quit: ");
		int grade = input.nextInt();

		// faz um loop até ler o valor de sentinela inserido pelo usuário
		while (grade != -1) {
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter + 1; // incrementa counter

			// solicita a entrada e lê a próxima nota fornecida pelo usuário
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}

		// fase de término
		// se usuário inseriu pelo menos uma nota...
		if (gradeCounter != 0) {

			// usa o numero com ponto decimal para calcular média das notas
			double average = (double) total / gradeCounter;

			// exibe o total e a média (com dois gigitos de precisão)
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		} else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
			System.out.println("No grades were entered");

	}

}