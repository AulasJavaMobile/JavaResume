package br.com.emerson.lesson4;

/*
  CHILD CLASS ou INNER class
 */
public class Dog extends Animal {

    private int qtdPresas;

    public int getQtdPresas() {
        return qtdPresas;
    }

    public void setQtdPresas(int qtdPresas) {
        this.qtdPresas = qtdPresas;
    }

    @Override
    public String fazBarulho() {
        return "AuAuuuu!";
    }
}
