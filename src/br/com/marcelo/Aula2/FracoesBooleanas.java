package br.com.marcelo.Aula2;

public class FracoesBooleanas {

    public static void main(String[] args) {

        int idade = 18;

        //Frase booleana simples
        if (idade >= 18) {
            //maior de idade
        } else {
            //menor de idade
        }

        //Frase booleana complexa
        if (idade >= 60) {
            //idoso
        } else if (idade > 1 && idade <= 12) {
            //criança
        } else if (idade > 12 && idade < 18) {
            //adolescente
        } else if (idade >= 18) {
            //adulto
        }

        /*
            DADO QUE:
            1 - JANEIRO
            2 - FEVEREIRO
            3 - MARCO
            4 - ETC
         */

        int mes = 2;
        switch (mes) {
            case 1:
                //janeirp
                System.out.println("Janeiro");
                break;
            case 2:
                //fevereiro
                System.out.println("Fevereiro");
            case 3:
                break;
            default:
                break;

        }

        System.out.println(new FracoesBooleanas().returnMonth(1));

        int num2 = 10;
        int num1 = 2;
        if ((num2 + num1) > 11) {
            System.out.println("maior que 11");
        }

        //&& -> And
        //|| -> Our

        //& -> only and
        //| -> only our

        int n = 1;
        if (n > 0 & n == 1 & n>10) {

        }

        if (startEngine() || rotateGear() || consumeOil()) {

        }

        //IF TERNARIO
        // REDUZIR LINHAS

        int n1 = 10;
        int n2 = 20;
        int maiorMumero;

        if(n1>n2){
            maiorMumero = n1;
        }else{
            maiorMumero = n2;
        }

        maiorMumero = n1>n2 ? n1 : n2;


        //String
        Integer numA = 10;
        Integer numB = 10;
        Integer numC = numB;

        System.out.println(numA.equals(numC));


        int x;
        Integer xWrapper;
        float f;
        Float fWrapper;


    }

    private static boolean startEngine(){
        return true;
    }

    private static boolean rotateGear(){
        return false;
    }

    private static boolean consumeOil(){
        return true;
    }

    public String returnMonth(int month) {
        switch (month) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            default:
                return "Outro mês";
        }
    }


}
