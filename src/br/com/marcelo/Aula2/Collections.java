package br.com.marcelo.Aula2;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
        //Arrays primitivos
        //Arrays objetos

        //JAVA 5 COLLECTIONS
        //-> LISTS
        //-> MAPS

        /*
         *  OBSOLETO
         */
        int myArray[] = {0, 1, 2, 3};

        String myString[] = new String[2];
        myString[0] = "a";
        myString[1] = "b";

        List<String> myList = new ArrayList<>();
        myList.add("Jean");
        myList.add("Marcelo");


        System.out.println(myList);
        System.out.println(myList.size());
        myList.remove("Jean");
        System.out.println(myList);
        myList.removeAll(myList);
        myList.clear();

        //MAPAS
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Marcelo");
        myMap.put(2, "Jean");
        myMap.put(3, "Emerson");

        System.out.println(myMap);

        System.out.println(myMap.get(2));











    }
}
