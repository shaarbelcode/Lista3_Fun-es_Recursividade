//Número ao contrário. Ler 5 números inteiros positivos e mostrar cada um com os
//dígitos invertidos.

package org.lista.shaarbel;

public class lista3_ex2 {
    static int inverterNumero(int numero){
        int invertido =0;
        while(numero!=0){
            int digito = numero%10;
            invertido = invertido*10+digito;
            numero = numero/10;
        }
        return invertido;
    }
    static void exibirInvertidos(int[]numeros){
        for(int i=0;i<numeros.length;i++){
            int quantidade = inverterNumero(numeros[i]);
            IO.println(quantidade);
        }
    }
    public static void main(String[] args){
        int[]numeroInteiro = new int[]{593,633,420,001,76,};
        exibirInvertidos(numeroInteiro);
    }
}
