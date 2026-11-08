//1. Quantidade de dígitos. Ler 5 números inteiros positivos e mostrar quantos dígitos cada
//um tem.
package org.lista.shaarbel;

public class lista3_ex1 {
    static int contarDigitos(int numero){
        int contador = 0;
        while (numero!=0){
            numero = numero/10;
            contador++;
        }
        return contador;
    }
    static void exibirDigitos(int[] numeros){
        for(int i=0;i<numeros.length;i++){
            int quantidade = contarDigitos(numeros[i]);
            IO.println("O numero " +numeros[i]+ " tem " + quantidade+ " digito(s)");
        }
    }
        public static void main(String[] args){
            int[]numeros = new int[]{56,3342,456789,12345,9};
                exibirDigitos(numeros);
        }
}
