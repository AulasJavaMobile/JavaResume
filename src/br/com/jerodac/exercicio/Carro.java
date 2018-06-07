package br.com.jerodac.exercicio;

public class Carro {

    private String marca;
    private String modelo;
    private String cor;

    //Getters e setters
    //Getters - Acessa
    //Setters - Altera

    //Setter marca
    public void setMarca(String marca){
        this.marca = marca;
    }

    //Getter marca
    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

}
