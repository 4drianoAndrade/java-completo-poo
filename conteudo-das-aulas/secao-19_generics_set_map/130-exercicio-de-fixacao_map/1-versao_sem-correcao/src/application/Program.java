package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> vote = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		// H:\GitHub\java-completo-poo\conteudo-das-aulas\secao-19_generics_set_map\temp\votes.txt

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);

				if (vote.containsKey(name)) {

					votes += vote.get(name);
					vote.put(name, votes);
				} else
					vote.put(name, votes);

				line = br.readLine();
			}

			for (String candidate : vote.keySet())
				System.out.println(candidate + ": " + vote.get(candidate));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
