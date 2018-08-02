package br.com.emerson.lesson3;

public class Animal {

    private int idade;
    private String raca;
    private String nome;
    private String ultimaVacina;

    public void verificaIdade() {
        if (idade > 3) {
            System.out.println("Animal na fase adulta");
        } else {
            System.out.println("Animal filhote");
        }
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimaVacina() {
        return ultimaVacina;
    }

    public void setUltimaVacina(String ultimaVacina) {
        this.ultimaVacina = ultimaVacina;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idade=" + idade +
                ", raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", ultimaVacina='" + ultimaVacina + '\'' +
                '}';
    }
}
