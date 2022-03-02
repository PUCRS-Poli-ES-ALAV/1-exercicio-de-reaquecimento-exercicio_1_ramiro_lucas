package br.pucrs.alav;

public class Recursion {

    // Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).

    public static void main(String Args[]) {
        System.out.println((multiplicacao_naturais(6,4)));
    }

    public int multiplicacao_naturais(int vezes_multiplicado, int valor){
        return soma(0,vezes_multiplicado, valor);
    }

    public int soma(int resultado, int vezes, int valor){
        if(vezes = 0) return resultado;
        return soma(resultado + valor,vezes-1, valor);
    }

}

