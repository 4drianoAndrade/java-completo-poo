import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		
		// Variáveis.
		String product1 = "Computer";
		String product2 = "Office desk";
		short age = 30; // menor que o int, também do tipo inteiro.
		int code = 5290;
		char gender = 'F'; // do tipo caractere, que aceita apenas uma entrada.
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		// Concatenando o conteúdo das variáveis.
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n%s, which price is $ %.2f%n", product1, price1, product2, price2);
		
			// \n também pula a linha.
			// System.out.println("\nRecord: " + age + " years old, code " + code + " and gender: " + gender + "\n");
		
		// Outra opção de print.
		// %c serve para concatenar variáveis do tipo caracter.
		System.out.printf("%nRecord: %d years old, code %d and gender: %c%n%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}
