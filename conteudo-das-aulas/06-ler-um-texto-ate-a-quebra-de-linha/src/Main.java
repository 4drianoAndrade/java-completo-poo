import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// (Ctrl + Shift + F) faz a auto indentação/formatação do código.

		Scanner sc = new Scanner(System.in);
		
		/*
		String s1, s2, s3;

		// Lê o texto até a quebra de linha/ENTER.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		int x;
		String s1, s2, s3;

		/* Devido a utilização do 'next' antes do 'nextLine', a variável que recebe como entrada
		 o 'Scanner' com 'nextLine' tem atribuido uma quebra de linha vazia como valor.
		x = sc.nextInt(); // Quebra de linha pendente.
		s1 = sc.nextLine(); // A variável "s1" acaba recebendo a quebra de linha ao invés do texto.
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		*/
		
		/* O único método que consome a quebra de linha é o nextLine().
		Se você fizer next(), nextInt() ou nextDouble(), precisa fazer um nextLine() em seguida,
		para consumir a quebra de linha que ficou no buffer.
		Outra opção é usar somente o método nextLine() e fazer parsing do resultado. */

		/*
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		x = sc.nextInt();
		sc.nextLine(); // Vai consumir a quebra de linha anterior que ficou pendente.
		s1 = sc.nextLine(); 
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
}
