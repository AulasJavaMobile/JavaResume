package br.com.emerson.lesson4;

public class ExemploHeranca {

    public static void main(String[] args) {

        Dog spike = new Dog();
        spike.setName("Spike");
        spike.setCategory("Maxo");
        spike.setQtdPresas(20);


        Cat lily = new Cat();
        lily.setName("Lily");
        lily.setCategory("Femea");
        lily.setQtdGarras(20);


        System.out.println("Cat: "+ lily.fazBarulho());
        System.out.println("Dog: "+ spike.fazBarulho());


    }

}
