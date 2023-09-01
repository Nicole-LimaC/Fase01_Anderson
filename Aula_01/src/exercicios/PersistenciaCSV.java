package exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaCSV {
	public static void main(String[] args) {

        String linha = "Teste 1" + ";" + "Teste 2" + ";" + "Teste 3" + "\n";
        String linha2 = "Teste 4" + ";" + "Teste 5" + ";" + "Teste 6" + "\n";
		
		try {
			FileWriter escritor = new FileWriter("planilha.csv");
			escritor.write(linha);
			escritor.write(linha2);
			escritor.close();
			System.out.println("Dados gravados com sucesso!");
			
		}
		catch (IOException e){
			System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
	}

}
