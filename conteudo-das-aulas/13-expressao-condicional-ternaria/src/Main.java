
public class Main {

	public static void main(String[] args) {
		
		double price = 34.5;
		
		/*
		double discount;
		
		if (price < 20.0)
			discount = price * 0.1;
		else
			discount = price * 0.05;
		*/
		
		// Expressão condicional ternária, é uma estrutura opcional ao if-else.
		// ( condição ) ? valor_se_verdadeiro : valor_se_falso
		double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
		
		System.out.println(discount);
	}
}
