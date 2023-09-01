package com.unifacisa.Aula_04;

public class Pessoa {

	private long id;
    private String nome;
    private String cpf;
    private String curso;
    private String periodo;
    
    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

    public String getCurso() {
		return curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
