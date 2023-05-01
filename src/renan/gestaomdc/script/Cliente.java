/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renan.gestaomdc.script;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String telefone;
    private String dataAniversario;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String aniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataAniversario = aniversario;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    
    @Override
    public String toString() {
        return "Cliente{ nome: " + nome + ", telefone: " + telefone + ", nascimento: " + dataAniversario +'}';
    }
    
    
}
