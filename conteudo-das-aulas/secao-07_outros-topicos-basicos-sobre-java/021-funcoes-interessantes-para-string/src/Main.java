
public class Main {

	public static void main(String[] args) {
		
		/*
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		// Converte todas as letras em minúsculo.
		String s01 = original.toLowerCase();
		
		// Converte todas as letras em maiúsculo.
		String s02 = original.toUpperCase(); 
		
		// Remove os espaços até o primeiro caractere da String, 
		// e também os espaços após o último caractere da String.
		String s03 = original.trim(); 
		
		// Recorta a String informando o campo de inicio, que começa pelo zero
		// incluindo os espaços, e monta uma nova String com esses caracteres.
		String s04 = original.substring(2); 
		
		// Recorta a String informando os argumentos de inicio e fim.
		String s05 = original.substring(2, 9); 
		
		// Esse comando substitui todos os caracteres que ele encontrar do 
		// primeiro parâmetro pelo do segundo dentro da String.
		// Levando em consideração se a letra é maiúscula ou minúscula.
		String s06 = original.replace('a', 'x'); 
		
		// Substitui o conjunto de String do primeiro parâmetro pelo do segundo.
		// De acordo com os tamanhos das letras.
		String s07 = original.replace("abc", "xy");
		
		// Retorna a posição da primeira ocorrência informada no argumento.
		// Ou seja, a primeira ocorrência que existir do parâmetro informado,
		// nesse caso a String "bc". 
		// Ela vai retornar o número da primeira posição independentemente se 
		// existem outras ocorrências na String.
		int i = original.indexOf("bc");
		
		// Já nesse caso, ela vai retornar a última ocorrência encontrada na
		// String, que é exatamente o contrário do comando anterior.
		int j = original.lastIndexOf("bc");

		System.out.println("Original: |" + original + "|");
		System.out.println("toLowerCase: |" + s01 + "|");
		System.out.println("toUpperCase: |" + s02 + "|");
		System.out.println("trim: |" + s03 + "|");
		System.out.println("substring(2): |" + s04 + "|");
		System.out.println("substring(2, 9): |" + s05 + "|");
		System.out.println("replace('a', 'x'): |" + s06 + "|");
		
		// O comando \"\" permite incluir aspas dentro das aspas da String.
		// Exemplo:
		//System.out.println("\"alguma coisa\"");
		
		System.out.println("replace(\"abc\", \"xy\"): |" + s07 + "|");
		System.out.println("indexOf(\"bc\"): |" + i + "|");
		System.out.println("lastIndexOf(\"bc\"): |" + j + "|");
		*/
		
		
		// Operação split.
		
		String s = "potato apple lemon";
		
		// Vetor de Strings.
		// O split é uma função que serve para recortar o String, de acordo
		// com o separador informado, que nesse caso seriam os espaços entre
		// as palavras da String "s", e distribui elas em cada posição do vetor.
		String[] vect = s.split(" "); // Iniciando na posição zero.
		
		// Atribuindo cada valor do vetor em uma variável.
		// Que nesse caso seriam as palavras separadas da String "s".
		//String word1 = vect[0];
		//String word2 = vect[1];
		//String word3 = vect[2];
		
		// Ou escrever elas direto na tela.
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
