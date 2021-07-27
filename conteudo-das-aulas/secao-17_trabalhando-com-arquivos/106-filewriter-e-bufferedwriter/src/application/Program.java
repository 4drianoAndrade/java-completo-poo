package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Godd afternoon", "Good night" };

		String path = "H:\\GitHub\\java-completo-poo\\conteudo-das-aulas\\secao-17_trabalhando-com-arquivos\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // (new FileWriter(path, true)))

			for (String line : lines) {

				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
