package com.controller.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

        @Id
        @GeneratedValue()
        private long id;

        @Column(nullable= false)
        private String nome;

        @Column(nullable= false)
        private String sobrenome;

        @Column(nullable= false)
        private String sexo;

        @Column(nullable= false)
        private String ddn;

        @Column(nullable= false)
        private int idade;

        @Column(nullable= false)
        private String cidade;

		

		

        public Cliente(){};
        public Cliente(String nome, String sobrenome, String sexo, String ddn, int idade, String cidade) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.sexo = sexo;
            this.ddn = ddn;
            this.idade = idade;
            this.cidade = cidade;
        }

    // Method
    // Creating toString
    @Override public String toString()
    {
        // Returning attributes of organisation
        return "nome [nome=" + nome + ","
                + "sobrenome=" + sobrenome + ','
                + "sexo=" + sexo + ','
                + "ddn=" + ddn + ','
                + "idade=" + idade + ','
                + "cidade=" + cidade + ','
                + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDdn() {
        return ddn;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
