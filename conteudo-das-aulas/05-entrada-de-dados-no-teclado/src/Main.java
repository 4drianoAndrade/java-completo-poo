// É necessário importar a classe 'Scanner' para poder usar a entrada de dados.
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Declarando a variável "sc" como objeto da classe 'Scanner'.
		// System.out mostra os dados na tela, System.in recebe os dados do teclado.
		Scanner sc = new Scanner(System.in);
		
		// 'next' atribui a variável "x" apenas uma palavra digitada no teclado, e não um texto com espaços.
		//String x = sc.next(); // Outra forma de declarar uma variável.
		
		//int x;
		//x = sc.nextInt(); // 'nextInt' atribui um número inteiro digitado no teclado.
		
		//System.out.println("Você digitou: " + x);
		
		/* 'nextDouble' atribui um número do tipo real a variável, porém, a utilização do ponto ou
	 	vírgula para separar as casas decimais, depende da localidade do seu sistema. */
		
		//double x = sc.nextDouble(); 
		// Com a instanciação do 'Locale' no início do bloco, agora é possível a utilização do ponto para separar as casas decimais.
		
		/* O comando 'println' utiliza uma localidade independente, então ele sempre printa com ponto ao invés de 
	 	vírgula os números quebrados, ao contrário do 'printf', que é de acordo com a localidade do sistema do usuário. */
		//System.out.printf("Você digitou: %.2f%n", x);
		
		/* Nesse caso o comando 'next' vai receber o que foi digitado em forma de String,
		e o comando 'charAt(0)' seleciona o primeiro caracter da palavra digitada. */
		//char x = sc.next().charAt(0);
		
		//System.out.println("Você digitou: " + x);
		
		String x;
		int y;
		double z;
		
		// Para ler vários dados na mesma linha no 'Console/Terminal'. Ex: 'Maria 30 4.5'
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// Encerra o objeto "sc" quando não tem mais utilidade.
		sc.close();
	}
}
