package br.com.emerson.lesson3;

public class Aula3 {

    public static void main(String[] args){
        Animal myAnimal = new Animal();
        myAnimal.setIdade(3);
        myAnimal.setNome("Nick");
        myAnimal.setRaca("Shitzu");
        myAnimal.setUltimaVacina("janeiro/2018");

        System.out.println(myAnimal.getNome());
        myAnimal.verificaIdade();
        System.out.println(myAnimal.toString());

    }
}
