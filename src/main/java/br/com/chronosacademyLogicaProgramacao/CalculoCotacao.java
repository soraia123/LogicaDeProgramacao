package br.com.chronosacademyLogicaProgramacao;

public class CalculoCotacao {
    public static void main(String[] args) {
        //Com o valor da cotação do dólar e uma certa quantidade de dólares.
        //Calcular e exibir o valor correspondente em Reais (R$).

        float real = 5.02f;
        float dolar = 15f;
        float cotacao = real * dolar;

        System.out.println("O valor da cotação é de: "+cotacao+" em Reais");


    }
}
