package br.com.emerson.lesson2;

import java.util.Scanner;

/**
 *    Modificadores de acesso:
 *    public - acesso publico
 *    protected - protegido (somente o pacote pode ver)
 *    default - (similiar ao protected, porém não precisa declarar)
 *    private - privado (somente a clase exerga)
 *
 *    static - acesso estatico (nao precisa de instancia)
 *
 *
 *    Modificadores de tipo:
 *    void (Metodo que não retorna valor)
 *    return: (int, float, double, boolean, ou qualquer objeto java :) )
 *
 *
 */
public class Lesson2Metodos {


    public static void main(String[] args){
        Lesson2Metodos minhaClasse = new Lesson2Metodos();

        minhaClasse.verificaMes(10);
        minhaClasse.verificaIdade(2);
    }


    public String verificaIdade(int idade){
        String tipo = new String();
        if(idade>18){
            tipo = "Adulto";
            System.out.println(tipo);
        }else if(idade >= 18){
            tipo = "Adolescente";
            System.out.println(tipo);
        }else if(idade<14){
            tipo = "Criança";
            System.out.println(tipo);
        }

        return tipo;
    }

    public void verificaMes(int mes){

        //   Solicite ao usuario um numero correspondente ao mes e imprima a descrição do mês
        //Ex: 2 - Fevereiro

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
    }

}
