package br.com.emerson.lesson2;

import java.util.Scanner;

public class Lesson2SwitchCase {

    public static void main(String[] args) {

     //   Solicite ao usuario um numero correspondente ao mes e imprima a descrição do mês
    //Ex: 2 - Fevereiro

        int mes = new Scanner(System.in).nextInt();

        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Janeiro");
                break;
            case 5:
                System.out.println("Janeiro");
                break;
            case 6:
                System.out.println("Janeiro");
                break;
            case 7:
                System.out.println("Janeiro");
                break;
            case 8:
                System.out.println("Janeiro");
                break;
            case 9:
                System.out.println("Janeiro");
                break;
            case 10:
                System.out.println("Janeiro");
                break;
            case 11:
                System.out.println("Janeiro");
                break;
            case 12:
                System.out.println("Janeiro");
                break;
            default:
                System.out.println("Mês Invalido");

        }


         /*
             Exemplo: Crie um algoritmo que que verifique se a idade é adulto, adolescente e criança
             Adulto: maior ou igual à 18 anos
             Adolescente: de 14 à 18 anos
             Criança: Menor que de 14 anos
         */

         int idade = 17;
         switch (idade){
             case 1:
             case 2:
             case 3:
             case 4:
             case 5:
             case 6:
                 System.out.println("Criança");
                 break;
             case 14:
             case 17:
                 System.out.println("Mocinho");
                 break;
             default:
                 System.out.println("Adulto");
         }



    }
}
