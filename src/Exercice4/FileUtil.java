package Exercice4;

import java.io.*;
import java.util.*;

public class FileUtil {

	public static List<Integer> readNumbers(String path) {
		List<Integer> list = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line;

			while ((line = reader.readLine()) != null) {
				line = line.trim();
				if (line.isEmpty())
					continue;

				list.add(Integer.parseInt(line));
			}

		} catch (IOException e) {

			logError("I/O error: " + e.getMessage());

		} catch (NumberFormatException e) {

			logError("Format invalide dans le fichier: " + e.getMessage());
		}

		return list;
	}

	private static void logError(String message) {
		try (FileWriter writer = new FileWriter("error.log", true)) {
			writer.write(message + System.lineSeparator());
		} catch (IOException e) {
			System.err.println("Erreur lors de l’écriture dans le journal : " + e.getMessage());
		}
	}
}
