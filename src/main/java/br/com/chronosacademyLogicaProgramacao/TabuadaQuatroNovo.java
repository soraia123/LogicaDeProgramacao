package br.com.chronosacademyLogicaProgramacao;
// novo exemplo da tabuada chamando método

public class TabuadaQuatroNovo {
    public static void main(String[] args) {
        int valor = 4;

        tabuada(valor);
    }

    public static void tabuada(int valor){

        for (int i = 10; i > 0; i = i - 1){
            System.out.println(valor+" x "+i+ " = "+valor * i );
        }
    }
}

