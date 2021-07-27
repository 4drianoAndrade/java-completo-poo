// Duas barras servem para fazer comentários.

// classe importada para funcionamento do Locale.US
import java.util.Locale;

// Nome da classe principal do programa.
public class Main {

	public static void main(String[] args) {
		
		// Declaração de variável do tipo inteiro com atribuição de valor.
		//int y = 32;
		
		// Variável do tipo ponto flutuante de dupla precisão.
		double x = 10.35784;
		
		// Mostrando o valor da variável y.
		//System.out.println(y);
		System.out.println(x);
		
		// printf mais %._f, escreve o conteúdo formatado, nesse caso com 2 casas decimais após a vírgula.
		// O %n realiza a quebra de linha. E a concatenação é feita através da vírgula.
		System.out.printf("%.2f%n", x);
		
		// Com 4 casas decimais, porém ele escreve o valor com vírgula e não com ponto,
		// igual ao padrão americano.
		System.out.printf("%.4f%n", x);
		
		// Altera a formatação de números fluantes para ponto ao invés de vírgula.
		// Porém é necessário importar a biblioteca/classe import java.util.Locale; no início do programa.
		Locale.setDefault(Locale.US);
		
		// Agora com ponto, após a declaração do Locale.US
		System.out.printf("%.4f%n", x);
		
		// Faz a concatenação de variáveis dentro do println
		System.out.println("RESULTADO = " + x + " METROS");
		
		// Concatenação com printf
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		// Variável do tipo cadeia ou texto.
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda); 
		// %s serve para concatenar textos, %d serve para números inteiros, e o %f para números reais.
		
		// Mostra o conteúdo do texto entre aspas duplas.
		// print escreve na mesma linha, println pula para linha de baixo.
		//System.out.print("Olá, mundo!");
		//System.out.println("Bom dia!");
	}
}
