package br.edu.imepac.entidades;

/*
Modificadores de acesso:
- public: A classe é acessível por qualquer outra classe.
- private: A classe só é acessível pela própria classe.
- protected: A classe é acessível pela própria classe e por classes que a estendem.
- default: A classe só é acessível por classes do mesmo pacote.
*/
public class Professor {
    private String nome;
    private String cpf;
    private Endereco endereco;

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
}
