package br.com.chronosacademyLogicaProgramacao;
// Exibir a tabuada do número cinco no intervalo de uma a dez
public class TabuadaCinco {
    public static void main(String[] args) {
        int tabuada = 5;

        for (int i = 1; i < 11; i = i + 1){
            System.out.println(tabuada+" x " +i+ " = " +tabuada * i);
        }
    }

}
