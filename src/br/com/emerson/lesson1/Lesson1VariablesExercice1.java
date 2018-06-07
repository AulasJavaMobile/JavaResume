package br.com.emerson.lesson1;


import java.util.Scanner;

/**
 * Calculador de idade
 * Solicite ao usuario o ano atual e tambem o ano que você nasceu
 * <p>
 * Mostre qual idade aproximada do usuario.
 */
public class Lesson1VariablesExercice1 {

    public static void main(String[] args) {
        System.out.println("Por favor informe o ano atual:");
        int anoAtual = Integer.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Agora seu ano de nascimento");
        int nascimento = Integer.valueOf(new Scanner(System.in).nextLine());
        int idade = anoAtual - nascimento;

        System.out.println(idade);
        if(idade >18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");

        }
    }
}
