package br.com.emerson.lesson2;

public class Lesson2IfElse {

    public static void main(String[] args) {

        int idade = 18;

       /*
             Exemplo: Crie um algoritmo que que verifique se a idade é adulto, adolescente e criança
             Adulto: maior ou igual à 18 anos
             Adolescente: de 14 à 18 anos
             Criança: Menor que de 14 anos
         */


        if(idade>18){
            System.out.println("Adulto");
        }else if(idade >= 18){
            System.out.println("Adolescente");
        }else if(idade<14){
            System.out.println("Criança");
        }

        //Frases booleanas, são objetos que podem se comparar atraves de instruções aritmeticas ou java object

    }
}