package br.edu.imepac.entidades;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Funcionario(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Funcionario() {
        super();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract double getSalario();

    public double getSalario(double bonificacao) {
        return getSalario() + bonificacao;
    }

}
