package aula.jdbc;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgreesql.Driver");
			System.out.println("Driver carregado com sucesso!");
			
		} catch (Exception ex) {
			System.out.println("Driver não pode ser carregado!");
		
		}
	}

}
