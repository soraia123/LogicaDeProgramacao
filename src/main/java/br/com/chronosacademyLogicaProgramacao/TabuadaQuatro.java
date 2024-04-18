package br.com.chronosacademyLogicaProgramacao;
//Exibir a tabuada do número quatro no intervalo de dez a um.
public class TabuadaQuatro {
    public static void main(String[] args) {
        int tabuada = 4;

        for (int i = 10; i > 0; i = i - 1){
            System.out.println(tabuada+" x "+i+ " = "+tabuada * i );
        }
    }
}
