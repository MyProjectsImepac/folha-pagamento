package br.edu.imepac.entidades;

public class Coordenador extends Funcionario{

    private int quantidadeAlunos;
    private double mensalidade;

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public double getSalario() {
        return quantidadeAlunos * ((1 * mensalidade)/100);
    }
}
