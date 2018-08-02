package br.com.emerson.lesson4;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeAnimal {

    private List<Animal> listaDeAnimais = new ArrayList<>();

    public void addAnimal(Animal animal) {
        listaDeAnimais.add(animal);
    }

    public void addAnimalTest(Dog animal) {
        listaDeAnimais.add(animal);
    }


    public List<Animal> getListaDeAnimais() {
        return listaDeAnimais;
    }

    public void setListaDeAnimais(List<Animal> listaDeAnimais) {
        this.listaDeAnimais = listaDeAnimais;
    }
}