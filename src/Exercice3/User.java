package Exercice3;

public class User {
	private String nom;
	private int age;

	public User(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public void validate() throws InvalidUserException {
		if (nom == null || nom.trim().isEmpty()) {

			throw new InvalidUserException("nom d'utilisateur invalide");
		}
		if (age < 18) {

			throw new InvalidUserException("Utilisateur mineur (âge=" + age + ")");
		}
	}

	@Override
	public String toString() {
		return String.format("User [nom=" + nom + ", age=" + age + "]");
	}

}
