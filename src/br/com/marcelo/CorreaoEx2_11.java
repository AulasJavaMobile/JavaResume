package br.com.marcelo;

public class CorreaoEx2_11 {

    private static Aula1 aula1 = new Aula1();

    public static void main(String[] args) {
        CorreaoEx2_11 myObject = new CorreaoEx2_11();
        System.out.println("Numero maior é: " + myObject.meuMetodo(2, 5));

        System.out.println(aula1.nome);
    }

    public int meuMetodo(int num1, int num2) {
//        int maiorNumero;
//
//        if(num1>num2){
//            maiorNumero = num1;
//        }else{
//            maiorNumero = num2;
//        }
//
//        return maiorNumero;

        return num1 > num2 ? num1 : num2;
    }
}
