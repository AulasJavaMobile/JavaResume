package br.com.emerson.lesson4;

/*
  CHILD CLASS
 */
public class Cat extends Animal {

   private int qtdGarras;

    public int getQtdGarras() {
        return qtdGarras;
    }

    public void setQtdGarras(int qtdGarras) {
        this.qtdGarras = qtdGarras;
    }

    @Override
    public String fazBarulho() {
      return "Miauuuu!";
    }
}
