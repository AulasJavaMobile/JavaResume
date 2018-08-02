package br.com.emerson.lesson4;

public class ExemploCadastroAnimal {

    public static void main(String[] args){

        CadastroDeAnimal cadastroDeAnimal = new CadastroDeAnimal();

        Dog spike = new Dog();
        spike.setName("Spike");
        spike.setCategory("Maxo");
        spike.setQtdPresas(20);

        Cat lily = new Cat();
        lily.setName("Lily");
        lily.setCategory("Femea");
        lily.setQtdGarras(20);
        cadastroDeAnimal.addAnimal(spike);
        cadastroDeAnimal.addAnimal(lily);

        Dog myDog = (Dog) cadastroDeAnimal.getListaDeAnimais().get(0);


        if(cadastroDeAnimal.getListaDeAnimais().get(0) instanceof Dog){
            myDog = (Dog) cadastroDeAnimal.getListaDeAnimais().get(0);
        }

    }
}
