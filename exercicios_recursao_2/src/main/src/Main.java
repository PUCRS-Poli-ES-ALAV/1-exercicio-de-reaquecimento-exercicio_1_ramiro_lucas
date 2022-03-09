package main.src;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var integers = new ArrayList<Integer>(3);
        integers.addAll(List.of(8,1,0,3,2,0,0,0,0,0,6));
//        System.out.println(convBase2(10));
//        System.out.println(convBase2(-1));
//        System.out.println(somatorio_arraylist(integers));
        System.out.println(findBiggest(integers));
    }

    /*
       Modele e implemente um método recursivo que recebeum inteiro zero ou positivo e
       retorna um String com onúmero em binário.
       String convBase2(int n)

       ASSINATURA
        public Stirg convBase2(int n)

       CASOS DE ERRO
        if(n<0) -> new throw Exception("Digite um numero mais que zero")

       CASOS BASE


       CASOS RECURSIVOS

     */

    public static String convBase2(int n) {

        if(n==0) return "0";
        if(n<0) throw new RuntimeException("Parametro deve ser maior ou igual a zero");

        return convBase2(n / 2).concat(Integer.toString(n % 2));
    }

    /*
        Modele e implemente um método recursivo que calcule osomatório dos números contidos em um ArrayList deinteiros,
        passado como parâmetro.

        ASSINATURA
        public static int somatorio_arraylist(ArrayList<Integer> arr)

       CASOS DE ERRO
        if(arr.isEmpty) -> throw new RuntimeException("Array nao pode ser vazio")

       CASOS BASE
        if(arr.size() == 1) -> arr.get(0)

       CASOS RECURSIVOS

     */
    public static int somatorio_arraylist(ArrayList<Integer> arr) {
        if(arr.isEmpty()) throw new RuntimeException("Array nao pode ser vazio");
        if(arr.size() == 1) return arr.get(0);

        return arr.get(0) + somatorio_arraylist(new ArrayList<>(arr.subList(1,arr.size())));
    }

    /*
        Modele e implemente um método recursivo paraencontrar o maior elemento de um ArrayList.

        ASSINATURA
        int findBiggest(ArrayList<Integer> ar)

       CASOS DE ERRO


       CASOS BASE


       CASOS RECURSIVOS

     */
    public static int findBiggest(ArrayList<Integer> ar) {
        if(ar.isEmpty()) throw new RuntimeException("Array nao pode ser vazio");
        if(ar.size() == 1) return ar.get(0);
        var biggest = findBiggest(new ArrayList<>(ar.subList(1, ar.size())));
        if(ar.get(0) > biggest){
            return ar.get(0);
        }
        return biggest;
    }
}
