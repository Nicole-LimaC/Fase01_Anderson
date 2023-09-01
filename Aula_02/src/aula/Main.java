package aula;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Fórmula_1").get();
		
		//Para tudo
		//System.out.println(doc);
		
		//Para tag específica
		//System.out.println(doc.getElementsByTag("p"));
		
		//Para seleção de um parágrafo específico
		//System.out.println(doc.getElementsContainingOwnText("o verde para as equipes inglesas, "));
		
		//Para extração de títulos de uma página web
		Elements titulo = doc.getElementsByTag("h1");
		String tituloConvertido = titulo.text();
		
		//Salvar o título extraido em um arquivo do tipo .txt
		try {
			FileWriter escritor = new FileWriter("titulo.txt");
			escritor.write(tituloConvertido);
			escritor.close();
			System.out.println("Dados gravados com sucesso!");
			
		}
		catch (IOException e){
			System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
	}

}
