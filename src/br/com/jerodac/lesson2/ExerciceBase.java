package br.com.jerodac.lesson2;

import java.util.Scanner;

/**
 *
 * Crie uma classe executavel tipo uma mini calculadora
 * Tenha 4 metodos:
 * Soma,
 * Subtracao,
 * Multiplcaca
 * Divisao
 *
 * por enquanto... vamos apenas fazer calculo com 2 numeros inteiro
 */
public class ExerciceBase {

    public static void main(String[]args){
        soma(10,10);
        subtracao(20,10);
        multiplicacao(2,2);
        divisao(10,5);

        //POO
        soma(multiplicacao(2,2), subtracao(10,2));


        System.out.println("Digite o primeiro numero");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = new Scanner(System.in).nextInt();

        soma(num1, num2);
    }

    public static int soma(int num1, int num2){
        System.out.println(num1+num2);
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2){
        System.out.println(num1-num2);
        return num1-num2;
    }

    public static int multiplicacao(int num1, int num2){
        System.out.println(num1*num2);
        return num1*num2;
    }

    public static int divisao(int num1, int num2){
        System.out.println(num1/num2);
        return num1/num2;
    }
}
