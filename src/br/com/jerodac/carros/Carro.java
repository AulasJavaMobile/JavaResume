package br.com.jerodac.carros;

public class Carro {

    /**MODIFICADORES DE ACESSO DE CLASSE, METODOS e VARIAVEIS**/
    //private - acesso privado, somente a classe pode enchergar
    //protected - somente classes do mesmo pacote pode enchergar
    //default -  somente classes do mesmo pacote pode enchergar
    //public - classes de todo o projeto pode enchergar

    //REGRA 1 - classes não podem ser private, somente subclasses
    //REGRA 2 - variaveis e metodos static podem ser acessadas diretamente sem instancia dentro de um metodo estatico

    /**MODIFICADORES DE ACESSO DE INSTANCIA**/
    //static - marca a objeto ou metodo como estatico, pode ser acessado sem instancia
    //final - siginifica que o objeto é uma constante ou seja não pode ser alterada


   protected static String marca = "Toyota";
   protected static String cor = "Branco";


}
