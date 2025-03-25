package br.edu.imepac.executaveis;


import br.edu.imepac.entidades.*;

public class Run {
    public static void main(String[] args) {
        Professor professor01 = createProfessor01();
        Professor professor02 = createProfessor02();

        System.out.println("Nome: " + professor01.getNome());
        System.out.println("CPF: " + professor01.getCpf());
        System.out.println("Endereço: " + professor01.getEndereco().getRua() + ", " + professor01.getEndereco().getNumero() + " - " + professor01.getEndereco().getBairro() + " - " + professor01.getEndereco().getCidade() + " - " + professor01.getEndereco().getEstado() + " - " + professor01.getEndereco().getCep());

        System.out.println("Nome: " + professor02.getNome());
        System.out.println("CPF: " + professor02.getCpf());
        System.out.println("Endereço: " + professor02.getEndereco().getRua() + ", " + professor02.getEndereco().getNumero() + " - " + professor02.getEndereco().getBairro() + " - " + professor02.getEndereco().getCidade() + " - " + professor02.getEndereco().getEstado() + " - " + professor02.getEndereco().getCep());

    }

    private static Professor createProfessor01() {
        Professor professor01 = new Professor();
        professor01.setNome("João");
        professor01.setCpf("123.456.789-00");

        Endereco endereco01 = new Endereco();
        endereco01.setRua("Rua 01");
        endereco01.setBairro("Bairro 01");
        endereco01.setCidade("Cidade 01");
        endereco01.setEstado("Estado 01");
        endereco01.setCep("12345-678");
        endereco01.setNumero("123");

        professor01.setEndereco(endereco01);
        return professor01;
    }

    private static Professor createProfessor02() {
        Professor professor01 = new Professor();
        professor01.setNome("Maria");
        professor01.setCpf("123.456.789-00");

        Endereco endereco01 = new Endereco();
        endereco01.setRua("Rua 01");
        endereco01.setBairro("Bairro 01");
        endereco01.setCidade("Cidade 01");
        endereco01.setEstado("Estado 01");
        endereco01.setCep("12345-678");
        endereco01.setNumero("123");

        professor01.setEndereco(endereco01);
        return professor01;
    }
}
