//package course;

import java.util.Locale;
import java.util.Scanner;

/*
Este programa calcula as raízes de uma equação do segundo grau

Os valores dos coeficientes devem ser digitados um por linha
*/

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Comentários em Java (básico)
		// Uma boa prática de programação é evitar o excesso de comentários.
		// Comentários devem ser usados com parcimônia.
		
		// (o.O) IH RAPAZ. 
		
		// É melhor colocar o nome das variáveis, funções, métodos, 
		// classes, atributos e operações de forma autoexplicativa.

		System.out.println("Digite os valores dos coeficientes:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2.0) - 4 * a * c; // cálculo do valor de delta
		System.out.println(delta);

		sc.close();
	}
}