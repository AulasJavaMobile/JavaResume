package br.com.jerodac.exercicio;

/**
 * Faço um pedido de compra, utilizando a classe carro
 * preenchendo seus objetos acessando atraves dos metodos getters e setters
 */
public class LojaDeCarro {

    public static void main(String[] args) {
        Carro carroDoManu = new Carro();

        carroDoManu.setMarca("GM");
        carroDoManu.setModelo("Cruze");
        carroDoManu.setCor("Prata");

        Carro carroDoJean = new Carro();
        carroDoJean.setMarca("Toyota");
        carroDoJean.setModelo("Corolla");
        carroDoJean.setCor("Branco Perolizado");

        System.out.println("Carro do Manu");
        System.out.println("Marca: "+carroDoManu.getMarca());
        System.out.println("Modelo: "+carroDoManu.getModelo());
        System.out.println("Cor: "+carroDoManu.getCor());

        System.out.println("Carro do Jean");
        System.out.println("Marca: "+carroDoJean.getMarca());
        System.out.println("Modelo: "+carroDoJean.getModelo());
        System.out.println("Cor: "+carroDoJean.getCor());

    }
}
