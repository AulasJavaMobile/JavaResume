package br.com.jerodac.lesson1;

import java.util.Scanner;

/**
 * Exercicio 1 - calculador de troco
 * <p>
 * Solicite ao usuario o valor do produto e quanto o cliente pagou em especie.
 * dado os seguintes parametros, calcule o fator do calculo para o troco.
 */
public class Lesson1VariablesExercice1 {

    public static void main(String[] args) {

        double productValue;
        double amountClientMoney;

        System.out.println("Por favor informe o valor do produto:");
        productValue = new Scanner(System.in).nextDouble();

        System.out.println("Quanto o cliente pagou em dinheiro?");
        amountClientMoney = new Scanner(System.in).nextDouble();

        double netValue = amountClientMoney - productValue;

        System.out.println("O valor do troco é: " + netValue);


    }
}
