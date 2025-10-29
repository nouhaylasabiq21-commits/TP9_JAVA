package Exercice4;

import java.util.*;

public class MainFile {
	public static void main(String[] args) {
		List<Integer> nums = FileUtil.readNumbers("numbers.txt");

		System.out.println("Nombres lus : " + nums);
		System.out.println("S'il y a eu des erreurs, elles ont été enregistrées dans 'error.log'.");
	}
}
