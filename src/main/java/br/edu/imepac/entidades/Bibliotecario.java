package br.edu.imepac.entidades;

public class Bibliotecario extends Funcionario {

    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getSalario() {
        return salario;
    }
}
