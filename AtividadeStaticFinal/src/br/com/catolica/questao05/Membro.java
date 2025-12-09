package br.com.catolica.questao05;
import java.util.ArrayList;
import java.util.List;

public class Membro {
    private final int id;
    private String nome;
    public List<Livro> livrosEmprestados;
    private static int totalMembros = 0;

    public Membro(String nome) {
        this.id = ++totalMembros;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public boolean emprestarLivro(Livro livro) {
        if (livrosEmprestados.size() >= Livro.LIMITE_EMPRESTIMOS) {
            System.out.println("Limite de empréstimos atingido para " + nome);
            return false;
        }
        if (!livro.isDisponivel()) {
            System.out.println("Livro " + livro.getTitulo() + " não está disponível");
            return false;
        }
        livro.setDisponivel(false);
        livrosEmprestados.add(livro);
        System.out.println(nome + " emprestou: " + livro.getTitulo());
        return true;
    }

    public boolean devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.setDisponivel(true);
            System.out.println(nome + " devolveu: " + livro.getTitulo());
            return true;
        }
        System.out.println(nome + " não tinha emprestado: " + livro.getTitulo());
        return false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static int getTotalMembros() {
        return totalMembros;
    }
}