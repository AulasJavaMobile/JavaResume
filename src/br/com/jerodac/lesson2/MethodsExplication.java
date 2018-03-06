package br.com.jerodac.lesson2;

/**
 * Blocos de codigo
 * <p>
 * Para que serve?
 * -Acomplamento e distribuição com intuito de reutilização de codigo e organização do projeto.
 * <p>
 * JAVA P.O.O (Programação orientada à objeto), metodos fazem parte de programação orientada objeto.
 * Essencia do Java
 */
public class MethodsExplication {

    public static void firstMethod(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void secondMethod(){

    }

    public static void thirdMethod(){

    }

    public static void main(String[] args) {
        //exemplo de codigo utilizando metodos
       int laranja = 5;
       int maca = 70;
       int abacaxi = 40;
       int brasil = 80;
       int ferrari = 70;

       firstMethod(maca, brasil);
    }



}
