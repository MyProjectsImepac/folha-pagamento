package br.edu.imepac.entidades;

/*
Modificadores de acesso:
- public: A classe é acessível por qualquer outra classe.
- private: A classe só é acessível pela própria classe.
- protected: A classe é acessível pela própria classe e por classes que a estendem.
- default: A classe só é acessível por classes do mesmo pacote.
*/
public class Professor extends Funcionario{
    private int quantidadeAulas;
    private double valorHoraAula;

    public Professor(String nome, String cpf, Endereco endereco, int quantidadeAulas, double valorHoraAula) {
        super(nome, cpf, endereco);
        this.quantidadeAulas = quantidadeAulas;
        this.valorHoraAula = valorHoraAula;
    }

    public Professor(){
        super();
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public void setQuantidadeAulas(int quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    @Override
    public double getSalario() {
        return this.valorHoraAula * this.quantidadeAulas;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
