package br.edu.imepac.executaveis;


import br.edu.imepac.entidades.Bibliotecario;
import br.edu.imepac.entidades.Coordenador;
import br.edu.imepac.entidades.Endereco;
import br.edu.imepac.entidades.Professor;

public class Run {
    public static void main(String[] args) {
        Professor professor01 = new Professor();

        professor01.setNome("Everton");
        professor01.setCpf("123.456.789-00");
        professor01.setQuantidadeAulas(80);
        professor01.setValorHoraAula(50.0);

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 01");
        endereco.setBairro("Bairro 01");
        endereco.setCidade("Cidade 01");
        endereco.setEstado("Estado 01");
        endereco.setCep("12345-678");
        endereco.setNumero("123");

        professor01.setEndereco(endereco);

        System.out.println("Nome: " + professor01.getNome());
        System.out.println("CPF: " + professor01.getCpf());
        System.out.println("Salário: " + professor01.getSalario());
        System.out.println("Salário: " + professor01.getSalario(5000));

        Coordenador coordenador01 = new Coordenador();

        coordenador01.setNome("Cristiane");
        coordenador01.setCpf("987.654.321-00");
        coordenador01.setQuantidadeAlunos(200);
        coordenador01.setMensalidade(700.0);

        System.out.println("Nome: " + coordenador01.getNome());
        System.out.println("CPF: " + coordenador01.getCpf());
        System.out.println("Salário: " + coordenador01.getSalario());


        Bibliotecario bibliotecario01 = new Bibliotecario();

        bibliotecario01.setNome("João");
        bibliotecario01.setCpf("456.789.123-00");
        bibliotecario01.setSalario(2000.0);

        System.out.println("Nome: " + bibliotecario01.getNome());
        System.out.println("CPF: " + bibliotecario01.getCpf());
        System.out.println("Salário: " + bibliotecario01.getSalario());

        Professor x = new Professor("Crispin", "123.456.789-00", null, 80, 50.0);
    }
}
