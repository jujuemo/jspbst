package exercicios;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String nome, int ano, int mes, int dia) {
        this.nome = nome;
        
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public int calcIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears(); 
    }

    @Override
    public String toString() {
        return this.nome + " " + calcIdade();
    }
}
