package br.com.jerodac.lesson2;

/**
 * Blocos de codigo
 * <p>
 * Para que serve?
 * -Acomplamento e distribuição com intuito de reutilização de codigo e organização do projeto.
 * <p>
 * JAVA P.O.O (Programação orientada à objeto), metodos fazem parte de programação orientada objeto.
 * Essencia do Java
 *
 * Metodos podem ser declarados dentro de classes, porem nao dentro de outro metodo.
 */
public class Methods {

    public static void main(String[] args) {

        //exemplo de codigo nao orientado, sem metodos
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + num2);

        int num3 = 8;
        int num4 = 15;

        System.out.println(num3 + num4);

        //exemplo de codigo utilizando metodos
        firstMethod(5,10);
        firstMethod(8,15);
    }


    /**
     Metodos também podem ser manipulado por modificadores de acesso
     (vamos ter uma aula sobre isso)
     *
     * Metodos tem algo que é show de bola!
     * Você pode utilizar parametros!!!
     *
     * Hummmm! É o que é Parametros?
     *
     * Parametros são variaveis ou objetos que podem ser passados na instrução do metodo, para serem utilizados dentro
     * do seu escopo.
     */
    public static void firstMethod(int num1, int num2){
        //Oi sou escopo do metodo firstMethod
        //Oi sou escopo do metodo firstMethod
        //Oi sou escopo do metodo firstMethod
        //Oi sou escopo do metodo firstMethod

        System.out.println(num1+num2);
    }

}
