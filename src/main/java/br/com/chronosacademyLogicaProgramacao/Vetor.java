package br.com.chronosacademyLogicaProgramacao;
//Crie um método que receba um array de dez valores inteiros.
//Esse método terá que exibir:
//
//A) O maior valor;
//B) A soma dos valores;
//C) A média aritmética dos valores;
//
//O método deverá ser executado através de uma aplicação.

public class Vetor {
    public static void main(String[] args) {
        int[] vetor = {2, 8, 7, 12, 5, 6, 15, 7, 1, 10};
        exibeResultados(vetor);

    }
    public static void exibeResultados(int[]vetor){
        int maior = 0;
        int soma = 0;
        float media = 0f;

//        for (int i = 0; i < vetor.length ; i++) {
//            System.out.println(vetor[i]);
//        }

        for (int valor : vetor){
            System.out.println(valor);

            //A) O maior valor;

            if (valor > maior){
                maior = valor;
            }
            //B) A soma dos valores;
            // soma = soma + valor; ou:

            soma += valor;

        }
        //C) A média aritmética dos valores;
        media = soma / (float) vetor.length;

        System.out.println("O maior valor é: "+maior);
        System.out.println("Soma dos valores é:" +soma);
        System.out.println("A média é:"+media);


    }
}
