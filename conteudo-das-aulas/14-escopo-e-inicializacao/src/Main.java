
public class Main {

	public static void main(String[] args) {

		// Escopo de uma variável: é a região do programa onde a variável é válida, ou
		// seja, onde ela pode ser referenciada. Em java, uma variável não pode ser
		// usada se não for iniciada.
		
		//double price;
		//System.out.println(price); // A IDE aponta um erro.
		
		//double price = 400;
		//System.out.println(price); // Sem erro.
		
		/* Outras alternativas.
		double x = 20.0;
		double price = x;
		
		double x = 20.0;
		double price = sc.nextDouble();
		*/
		
		//double price;
		//double x = price; // Retorna um erro também.
		
		//System.out.println(price);
		
		double price = 400.00;
		
		/*
		if (price < 200.00) { // Sem o uso das chaves dá erro na variável "discount".
			double discount = price * 0.1;
		}
		*/
		
		// Também dá erro por não fazer parte do mesmo escopo 
		// na estrutura do bloco 'if'.
		//System.out.println(discount); 
		
		
		//double discount;
		/*
		if (price < 200.00)
			discount = price * 0.1;
		*/
		
		// O compilador detectou que a variável pode não ter sido iniciada.
		// Porque a condição 'if' pode ser falsa, e o comando de inicialização é pulado.
		//System.out.println(discount);
		
		// As duas possíveis alternativas seriam, atribuir um valor como por exemplo o "0"
		// a variável "discount", ou incluir uma condição 'else' no bloco 'if'.
		
		/*
		double discount;
		
		if (price < 200.00)
			discount = price * 0.1;
		else
			discount = 0.0;
		*/
		
		double discount = 0.0;
		
		if (price < 200.00)
			discount = price * 0.1;
		
		
		System.out.println(discount);
	}
}
