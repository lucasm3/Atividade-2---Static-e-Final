package br.com.catolica.questao05;

public final class BibliotecaUtil {
    public static final int DIAS_EMPRESTIMO = 14;
    public static final double MULTA_DIARIA = 0.50;

    private BibliotecaUtil() {}

    public static boolean validarTitulo(String titulo) {
        return titulo != null && !titulo.trim().isEmpty();
    }

    public static boolean validarAutor(String autor) {
        return autor != null && autor.matches("[a-zA-Z\\s]+");
    }

    public static double calcularMulta(int diasAtraso) {
        return diasAtraso * MULTA_DIARIA;
    }
}