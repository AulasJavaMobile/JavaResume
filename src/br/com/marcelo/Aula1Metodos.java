package br.com.marcelo;

import br.com.marcelo.escolas.Escola;

import java.util.ArrayList;
import java.util.List;

public class Aula1Metodos {


    public static void main(String[] args) {
        //modificadores de acesso

        //modificador de visibilidade
        //private - privado / a nivel de classe
        //protected - protegido / a nivel de pacote
        //default - similiar o protected
        //public - nivel public / a nivel de pacote

        //modificador de acesso de memoria
        //static / pode ser acessado diretamente sem uma referencia de memoria da classe
        //in instance / ele precisa de uma instancia do objeto

        /**
         tipos de metodo

         tipo void: void()
         tipo retornavel
         -> primtivo
         -> Objeto (Classes)
         */

        List<Escola> mySchools = new ArrayList<>();
        mySchools.add(registerSchool(1, "Cinelzia"));
        mySchools.add(registerSchool(2, "Isaque"));
        mySchools.add(registerSchool(3, "Mackeinze"));


    }

    public static Escola registerSchool(int id, String escola) {
        Escola var = new Escola();
        var.setIdEscola(id);
        var.setNome(escola);
        return var;
    }


}