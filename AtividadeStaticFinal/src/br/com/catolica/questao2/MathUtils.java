package br.com.catolica.questao2;

public class MathUtils {
    public static long calcFat(int n) {
        if (n < 0) {
            System.out.println("Não há fatorial de número negativo");
        }
        int fatorial = 1;
        for (int i = 1; i <= n; i++){
            fatorial *= i;
        }
        return fatorial;
        }

    public static boolean Primo(int n){
        if (n <= 1)return false;
        for (int i = 2;i < Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static double cParaF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fParaC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double cParaK(double celsius) {
        return celsius + 273.15;
    }

    public static double kParaC(double kelvin) {
        return kelvin - 273.15;
    }

}