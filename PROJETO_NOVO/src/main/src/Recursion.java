package main.src;

public class Recursion {

    // Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).


    public static int multiplicacao_naturais(Integer resultado, int vezes_multiplicado, int valor){
        if(vezes_multiplicado == 0) return resultado;
        return multiplicacao_naturais(resultado + valor,--vezes_multiplicado, valor);
    }

    // Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
    public static int somas_sucessivas(int soma_inicial, int vezes) {
        if(vezes==0){return soma_inicial;}
        return somas_sucessivas(++soma_inicial,--vezes);
    }

    //Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
    public static double fracionador(int vezes){
        if(vezes == 0) return 0;
        return 1/vezes + fracionador(--vezes);
    }


    // metodo de inversao de string
    public static String inverter(String s){
        if(s.length() == 0) return "";
        return inverter(s.substring(1)) + s.charAt(0);
    }
}

