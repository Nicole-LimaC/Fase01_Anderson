package com.unifacisa.Aula_04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
	public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Serialize
        StringWriter writer = new StringWriter();
        mapper.writeValue(writer, getPessoas());
        System.out.println(writer);

        // Deserialize
        String jsonInput = "[{\"id\":1,\"nome\":\"Lucas\",\"cpf\":\"111.111.111-11\",\"curso\":\"Arquitetura e Urbanismo\",\"periodo\":\"1º Período\"},"
        		+ "{\"id\":2,\"nome\":\"Nicole\",\"cpf\":\"222.222.222-22\",\"curso\":\"Medicina Veterinária\",\"periodo\":\"2º Período\"},"
                + "{\"id\":3,\"nome\":\"José\",\"cpf\":\"333.333.333-33\",\"curso\":\"Enfermagem\",\"periodo\":\"3º Período\"},"
                + "{\"id\":4,\"nome\":\"Thiago\",\"cpf\":\"444.444.444-44\",\"curso\":\"Sistemas de Informação\",\"periodo\":\"4º Período\"},"
                + "{\"id\":5,\"nome\":\"Gabriel\",\"cpf\":\"555.555.555-55\",\"curso\":\"Medicina\",\"periodo\":\"5º Período\"},"
                + "{\"id\":6,\"nome\":\"Lincoln\",\"cpf\":\"666.666.666-66\",\"curso\":\"Ciência da Computação\",\"periodo\":\"6º Período\"},"
                + "{\"id\":7,\"nome\":\"Larry\",\"cpf\":\"777.777.777-77\",\"curso\":\"Engenharia Química\",\"periodo\":\"7º Período\"}]";
        List<Pessoa> p = mapper.readValue(jsonInput, new TypeReference<List<Pessoa>>(){});
        System.out.println("Pessoa: " + p);
        
     // Write JSON to a file using FileWriter
        FileWriter escritor = new FileWriter("arquivo.json");
        mapper.writeValue(escritor, p);
        escritor.close();
    }

    private static List<Pessoa> getPessoas() {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa();
        p1.setId(1);
        p1.setNome("Lucas");
        p1.setCpf("111.111.111-11");
        p1.setCurso("Arquitetura e Urbanismo");
        p1.setPeriodo("1º Período");

        Pessoa p2 = new Pessoa();
        p2.setId(2);
        p2.setNome("Nicole");
        p2.setCpf("222.222.222-22");
        p2.setCurso("Medicina Veterinária");
        p2.setPeriodo("2º Período");        

        Pessoa p3 = new Pessoa();
        p3.setId(3);
        p3.setNome("José");
        p3.setCpf("333.333.333-33");
        p3.setCurso("Enfermagem");
        p3.setPeriodo("3º Período");
        
        Pessoa p4 = new Pessoa();
        p4.setId(4);
        p4.setNome("Thiago");
        p4.setCpf("444.444.444-44");
        p4.setCurso("Sistemas de Informação");
        p4.setPeriodo("4º Período");
        
        Pessoa p5 = new Pessoa();
        p5.setId(5);
        p5.setNome("Gabriel");
        p5.setCpf("555.555.555-55");
        p5.setCurso("Medicina");
        p5.setPeriodo("5º Período");
        
        Pessoa p6 = new Pessoa();
        p6.setId(6);
        p6.setNome("Lincoln");
        p6.setCpf("666.666.666-66");
        p6.setCurso("Ciência da Computação");
        p6.setPeriodo("6º Período");
        
        Pessoa p7 = new Pessoa();
        p7.setId(7);
        p7.setNome("Larry");
        p7.setCpf("777.777.777-77");
        p7.setCurso("Engenharia Química");
        p7.setPeriodo("7º Período");
        

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);
        pessoas.add(p7);

        return pessoas;

    }
}
