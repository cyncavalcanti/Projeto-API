package com.controller.api.model;
import javax.persistence.*;

@Entity
public class Cidade {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable= false)
    private String nome;

    @Column(nullable= false)
    private String estado;
    
    
    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public Cidade() {

    }

   
    @Override
    public String toString() {
       return "nome [nome="
                + nome
                + ", estado=" + estado
                + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}