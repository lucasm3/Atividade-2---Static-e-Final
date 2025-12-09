package br.com.catolica.questao05;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private final int codigo;
    private final String titulo;
    private final String autor;
    private boolean disponivel;
    private static int totalLivros = 0;
    public static final int LIMITE_EMPRESTIMOS = 2;

    public Livro(String titulo, String autor) {
        this.codigo = ++totalLivros;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public static int getTotalLivros() {
        return totalLivros;
    }
}