package exercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaBinaria {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Larry", 28);
		
		try {
			FileOutputStream arquivo = new FileOutputStream("dados.bin");
			ObjectOutputStream escritor = new ObjectOutputStream(arquivo);
			
			escritor.writeObject(pessoa);
			
			escritor.close();
			arquivo.close();
			System.out.println("Objeto gravado com sucesso!");
		}
		catch (IOException e) {
			System.err.println("Erro ao gravar objeto: " + e.getMessage());			
		}
	}

}

class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}
