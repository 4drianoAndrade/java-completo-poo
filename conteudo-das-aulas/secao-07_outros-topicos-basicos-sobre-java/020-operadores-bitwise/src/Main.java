import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int n1 = 89;
		int n2 = 60;
		
		// Operadores bitwise.
		// Utilizados em programação de baixo nível.
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		*/
		
		//int mask = 32;
		//int mask = 0b00100000; // '0b' indica que será um número binário.
		int mask = 0b100000; // Os zeros a esquerda são opcionais.
		
		int n = sc.nextInt();
		
		// Verifica se o sexto bit é 1.
		if ((n & mask) != 0)
			System.out.println("6th bit is true!");
		else
			System.out.println("6th bit is false!");
		
		sc.close();
	}
}
