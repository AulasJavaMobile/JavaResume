package br.com.marcelo;

public class Aula1 {

    public String nome = "Marcelo";

    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        //2 tipos de variveis

        //tipo primitivo
        int meuInteiro = 10;

        //tipo objeto
        Pessoa minhaVariavel = new Pessoa();
        String myString = "Marcelo";

        //tipo primitivo
        int myInt = 20;
        float myFloat = 1.4f;
        double myDouble = 10.0;
        long myLong = 100000l;
        boolean myBoolean;

        int age = 18;
        boolean isRegisterEnable = false;


        isRegisterEnable = age > 18;

        if (isRegisterEnable) {
            //chama metodo para cadastro
        } else {
            //mostra tela falando que é menor de idade
        }

        char myChar = '1';
        byte myByte = 10; //stream de dados

    }
}
