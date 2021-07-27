package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path:");
		String strPath = sc.nextLine(); // FOLDERS E FILES | H:\GitHub\java-completo-poo

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("\nFOLDERS:");

		for (File folder : folders)
			System.out.println(folder);

		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFILES:");

		for (File file : files)
			System.out.println(file);

		// CRIA PASTA NESSE DIRETÓRIO |
		strPath += "\\conteudo-das-aulas\\secao-17_trabalhando-com-arquivos";

		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("\nDirectory created successfully: " + success);

		sc.close();
	}
}
